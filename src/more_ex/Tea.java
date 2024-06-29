package more_ex;

public class Tea extends Beverage {

    @Override
    public void brew() {
        System.out.println("Brew Tea");
    }

    @Override
    public void addCondiment() {
        System.out.println("No condiment for tea");
    }

}
