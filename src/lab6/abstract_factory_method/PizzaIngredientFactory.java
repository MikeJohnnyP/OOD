package lab6.abstract_factory_method;

import java.util.ArrayList;

public interface PizzaIngredientFactory {
  public Dough createDough();
  public Sauce createSauce();
  public Cheese createCheese();
  public ArrayList<Veggies> createVeggies();
  public Pepperoni createPepperoni();
  public Clams createClams();
}
