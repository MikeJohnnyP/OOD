package lab6.factory_method;

public abstract class PizzaStore {
  protected abstract Pizza createPizza(PizzaType type);

  public void orderPizza(PizzaType type) {
    Pizza pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

  }
}
