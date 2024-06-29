package lab6.factory_method;

public class ChicagoStylePepperoniPizza extends Pizza {
  public ChicagoStylePepperoniPizza() {
    setName("Chicago Style Pepperoni Pizza");
    setDough("Thick Crust Dough");
    setSauce("Plum Tomato Sauce");
    addTopping("Shredded Mozzarella Cheese");
    addTopping("Sliced Pepperoni");
  }
}
