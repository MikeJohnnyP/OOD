package lab7.the_duck;

public class WildTurkey implements Turkey {

  @Override
  public void gobble() {
    System.out.println("I'm gobbling!!!");
  }

  @Override
  public void fly() {
    System.out.println("I can't fly ");
  }

}
