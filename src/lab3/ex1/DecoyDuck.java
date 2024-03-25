package lab3.ex1;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super(new FlyNoWay(), new Squick());
    }

    @Override
    public void display() {
        System.out.println("Decoy!!!");
    }

}
