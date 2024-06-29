package lab8.ex0;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage c1 = new Tea();
        c1.prepareRecipe();

        CaffeinBeverageWithHook c2 = new CoffeeWithHook();
        c2.prepareRecipe();

    }
}
