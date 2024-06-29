package lab6.abstract_factory_method;

import java.util.ArrayList;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarianaSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public ArrayList<Veggies> createVeggies() {
    ArrayList<Veggies> veggies = new ArrayList<Veggies>();
    veggies.add(new Garlic());
    veggies.add(new Onion());
    veggies.add(new Mushroom());
    veggies.add(new RedPepper());
    return veggies;
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClams() {
    return new FreshClams();
  }

}
