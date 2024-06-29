package lab6.abstract_factory_method;

import java.util.ArrayList;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }


  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public ArrayList<Veggies> createVeggies() {
    ArrayList<Veggies> veggies = new ArrayList<Veggies>();
    veggies.add(new BlackOlives());
    veggies.add(new Spinach());
    veggies.add(new EggPlant());
    return veggies;
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClams() {
    return new FrozenClams();
  }

}
