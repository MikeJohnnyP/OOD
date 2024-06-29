package more_ex;

public class HotChocolate extends Beverage {

    @Override
    public void brew() {
        System.out.println("Brew Hot Chocolate");
    }

    @Override
    public void addCondiment() {
        System.out.println("More sweet\nAdd Cream pie");
    }

}
