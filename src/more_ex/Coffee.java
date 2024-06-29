package more_ex;

public class Coffee extends Beverage {

    @Override
    public void brew() {
        System.out.println("Brew Coffee");
    }

    @Override
    public void addCondiment() {
        System.out.println("Add Milk\nMore water\nAdd peper");
    }

}
