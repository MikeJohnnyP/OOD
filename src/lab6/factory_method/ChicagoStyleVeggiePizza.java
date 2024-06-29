package lab6.factory_method;

public class ChicagoStyleVeggiePizza extends Pizza {
  public ChicagoStyleVeggiePizza() {
    setName("Chicago Deep Dish Veggie Pizza");
    setDough("Extra Thick Crust Dough");
    setSauce("Plum Tomato Sauce");
    addTopping("Shredded Mozzarella Cheese");
    addTopping("Black Olives");
    addTopping("Spinach");
    addTopping("Eggplant");
  }
}
