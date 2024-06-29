package lab6.simple_pizza_factory;

public class TestDrivePizza {
  public static void main(String[] args) {
    PizzaStore pizzaStore = new PizzaStore();
    Pizza pizza = pizzaStore.orderPizza(PizzaType.CHEESE);
    System.out.println("We ordered a " + pizza.getName() + "\n");
    pizza = pizzaStore.orderPizza(PizzaType.PEPPERONI);
    System.out.println("We ordered a " + pizza.getName() + "\n");
    pizza = pizzaStore.orderPizza(PizzaType.CLAM);
    System.out.println("We ordered a " + pizza.getName() + "\n");
    pizza = pizzaStore.orderPizza(PizzaType.VEGGIE);
    System.out.println("We ordered a " + pizza.getName() + "\n");
  }
}
