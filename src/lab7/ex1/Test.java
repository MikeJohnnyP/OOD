package lab7.ex1;

public class Test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        DuckAdapter duckAdapter = new DuckAdapter(duck);
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Duck says2...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe DuckAdapter says...");
        duckAdapter.gobble();
        duckAdapter.fly();

        System.out.println("\nThe TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
