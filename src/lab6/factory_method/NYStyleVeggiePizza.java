package lab6.factory_method;

public class NYStyleVeggiePizza extends Pizza {
  public NYStyleVeggiePizza() {
    setName("NY Style Veggie Pizza");
    setDough("Thin Crust Dough");
    setSauce("Marinara Sauce");
    addTopping("Grated Reggiano Cheese");
    addTopping("Sliced Pepperoni");
  }
}
