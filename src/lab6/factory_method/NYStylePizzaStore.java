package lab6.factory_method;

public class NYStylePizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(PizzaType type) {
    if (type == PizzaType.CHEESE) {
      return new NYStyleCheesePizza();
    } else if (type == PizzaType.PEPPERONI) {
      return new NYStylePepperoniPizza();
    } else if (type == PizzaType.CLAM) {
      return new NYStyleClamPizza();
    } else if (type == PizzaType.VEGGIE) {
      return new NYStyleVeggiePizza();
    } else {
      return null;
    }
  }

}
