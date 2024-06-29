package lab7.ex1;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("I'm gobbling");
    }

    @Override
    public void fly() {
        System.out.println("Wild Turkey is flying");
    }

}
