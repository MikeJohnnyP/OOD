package lab6.simple_pizza_factory;

public class SimplePizzaFactory {
  public Pizza createPizza(PizzaType pizzaType) {
    Pizza pizza;
    if (pizzaType == PizzaType.CHEESE) {
      pizza = new CheesePizza();
    } else if (pizzaType == PizzaType.PEPPERONI) {
      pizza = new PepperoniPizza();
    } else if (pizzaType == PizzaType.CLAM) {
      pizza = new ClamPizza();
    } else if (pizzaType == PizzaType.VEGGIE) {
      pizza = new VeggiePizza();
    } else
      return null;

    return pizza;
  }
}
