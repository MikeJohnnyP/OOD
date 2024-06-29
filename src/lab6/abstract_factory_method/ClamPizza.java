package lab6.abstract_factory_method;

public class ClamPizza extends Pizza{
  PizzaIngredientFactory ingredientFactory;

  public ClamPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }
  @Override
  public void prepare() {
    System.out.println("Preparing Clam Pizza");
    setDough(ingredientFactory.createDough());
    setSauce(ingredientFactory.createSauce());
    setCheese(ingredientFactory.createCheese());
    setClams(ingredientFactory.createClams());
  }
  
}
