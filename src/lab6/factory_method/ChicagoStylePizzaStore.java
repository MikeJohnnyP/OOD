package lab6.factory_method;

public class ChicagoStylePizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(PizzaType type) {
    if (type == PizzaType.CHEESE) {
      return new ChicagoStyleCheesePizza();
    } else if (type == PizzaType.PEPPERONI) {
      return new ChicagoStylePepperoniPizza();
    } else if (type == PizzaType.CLAM) {
      return new ChicagoStyleClamPizza();
    } else if (type == PizzaType.VEGGIE) {
      return new ChicagoStyleVeggiePizza();
    } else {
      return null;
    }
  }

}
