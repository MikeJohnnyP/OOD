package lab6.simple_pizza_factory;

public class VeggiePizza extends Pizza {
  public VeggiePizza() {
    setName("Veggie Pizza");
    setDough("Crust");
    setSauce("Marinara sauce");
    addTopping("Shredded mozzarella");
    addTopping("Grated parmesan");
    addTopping("Diced onion");
  }
}
