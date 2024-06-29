package lab6.abstract_factory_method;

public class PepperoniPizza extends Pizza{
  private PizzaIngredientFactory ingredientFactory;

  public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }
  @Override
  public void prepare() {
    System.out.println("Preparing Pepperoni Pizza");
    setDough(ingredientFactory.createDough());
    setSauce(ingredientFactory.createSauce());
    setCheese(ingredientFactory.createCheese());
    setPepperoni(ingredientFactory.createPepperoni());
  }

}
