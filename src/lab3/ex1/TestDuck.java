package lab3.ex1;

public class TestDuck {
    public static void main(String[] args) {

        Duck d1 = new MallardDuck();
        d1.display();
        d1.performFly();
        d1.performQuack();

        Duck d2 = new RedHeadDuck();
        d2.display();
        d2.performFly();
        d2.performQuack();
        d2.setFlyBehavior(new FlyNoWay());
        d2.performFly();

        Duck d3 = new DecoyDuck();
        d3.display();
        d3.performFly();
        d3.performQuack();
        d3.setQuackBehavior(new MuteQuack());
        d3.performQuack();

        Duck d4 = new RubberDuck();
        d4.display();
        d4.performFly();
        d4.performQuack();

    }
}
