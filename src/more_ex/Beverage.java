package more_ex;

public abstract class Beverage {
    public void prepare() {
        boilWater();
        brew();
        addCondiment();
        pourlnCup();
    }

    public void boilWater() {
        System.out.println("Boil water");
    }

    public abstract void brew();

    public abstract void addCondiment();

    public void pourlnCup() {
        System.out.println("Pour cup");
    }

}
