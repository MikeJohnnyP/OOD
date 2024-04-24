package lab5.cafe_Starbuzz;

public class TestMain {
    public static void main(String[] args) {
        Beverage b = new DarkRoast();
        // b = new Mocha(b);
        // b = new Whip(b);
        // b = new Mocha(b); // Add more mocha
        b = new Milk(
                new Soy(
                        new Milk(
                                new Espresso())));

        System.out.println(b.getDescription() + " $" + b.cost());
    }

}
