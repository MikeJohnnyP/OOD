package lab8.ex0;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Stepping the tea");
        System.out.println("Pouring the tea");

    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

}
