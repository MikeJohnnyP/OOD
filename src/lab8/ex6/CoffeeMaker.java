package lab8.ex6;

public class CoffeeMaker extends BeverageMaker {

    @Override
    void addBeverage() {
        System.out.println("Pouring coffee");
        System.out.println("Adding hot water");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
        System.out.println("Coffee is ready");
    }

}
