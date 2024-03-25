package lab3.ex1;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<<Silence>>>");
    }

}
