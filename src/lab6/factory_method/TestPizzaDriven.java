package lab6.factory_method;

public class TestPizzaDriven {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYStylePizzaStore();
    nyStore.orderPizza(PizzaType.CHEESE);
    nyStore.orderPizza(PizzaType.PEPPERONI);
    nyStore.orderPizza(PizzaType.CLAM);
    nyStore.orderPizza(PizzaType.VEGGIE);
  }
}
