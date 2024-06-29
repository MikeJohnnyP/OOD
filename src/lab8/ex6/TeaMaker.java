package lab8.ex6;

public class TeaMaker extends BeverageMaker {

    @Override
    void addBeverage() {
        System.out.println("Pouring tea");
        System.out.println("Adding hot water");

    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and lemon");
        System.out.println("Tea is ready");
    }

}
