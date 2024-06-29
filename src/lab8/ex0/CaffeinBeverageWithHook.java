package lab8.ex0;

public abstract class CaffeinBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourlnCup();
        if (customerWantCondiment()) {
            addCondiment();
        }
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();

    abstract void addCondiment();

    void pourlnCup() {
        System.out.println("Pouring into the cup");
    }

    boolean customerWantCondiment() {
        return true;
    }

}
