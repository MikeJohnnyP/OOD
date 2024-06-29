package lab6.factory_method;

public class NYStyleClamPizza extends Pizza {
  public NYStyleClamPizza() {
    setName("NY Style Clam Pizza");
    setDough("Thin Crust Dough");
    setSauce("Marinara Sauce");
    addTopping("Grated Reggiano Cheese");
    addTopping("Fresh Clams from Long Island Sound");
  }
}
