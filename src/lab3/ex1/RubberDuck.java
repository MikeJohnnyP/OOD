package lab3.ex1;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Rubber Duckie");
    }

}
