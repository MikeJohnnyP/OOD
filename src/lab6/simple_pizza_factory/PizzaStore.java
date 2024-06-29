package lab6.simple_pizza_factory;

public class PizzaStore {
  SimplePizzaFactory factory = new SimplePizzaFactory();

  public Pizza orderPizza(PizzaType type) {
    Pizza pizza = factory.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

}
