package lab7.the_duck;

public class Test {

  public static void main(String[] args) {
    WildTurkey turkey = new WildTurkey();
    MallardDuck duck = new MallardDuck();
    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    turkey.gobble();
    turkey.fly();
    duck.fly();
    duck.quack();

    turkeyAdapter.fly();
    turkeyAdapter.quack();
    Turkey turkey3 = new DuckAdapter(duck);
    turkey3.gobble();
    turkey3.fly();
  }

}
