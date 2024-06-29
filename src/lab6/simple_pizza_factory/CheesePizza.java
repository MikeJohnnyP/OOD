package lab6.simple_pizza_factory;

public class CheesePizza extends Pizza {
  public CheesePizza(){
    setName("Cheese Pizza");
    setDough("Regular Crust");
    setSauce("Marinara Pizza Sauce");
    addTopping("Fresh Mozzarella");
    addTopping("Parmesan");
  }
}
