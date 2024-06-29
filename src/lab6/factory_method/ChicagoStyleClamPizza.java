package lab6.factory_method;

public class ChicagoStyleClamPizza extends Pizza {
  public ChicagoStyleClamPizza() {
    setName("Chicago Style Clam Pizza");
    setDough("Extra Thick Crust Dough");
    setSauce("Plum Tomato Sauce");
    addTopping("Shredded Mozzarella Cheese");
    addTopping("Frozen Clams from Chesapeake Bay");
  }
}
