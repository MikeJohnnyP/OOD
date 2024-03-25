package lab3.ex1;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a red head duck!!!");
    }

}
