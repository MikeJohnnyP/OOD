package lab8.ex6;

public class Main {
    public static void main(String[] args) {
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage();

        System.out.println();

        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();
    }
}
