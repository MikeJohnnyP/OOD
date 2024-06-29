package lab6.abstract_factory_method;

public class VeggiesPizza extends Pizza{
  private PizzaIngredientFactory ingredientFactory;

  public VeggiesPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }
  @Override
  public void prepare() {
    System.out.println("Preparing Veggies Pizza");
    setDough(ingredientFactory.createDough());
    setSauce(ingredientFactory.createSauce());
    setCheese(ingredientFactory.createCheese());
    setVeggies(ingredientFactory.createVeggies());
  }

}
