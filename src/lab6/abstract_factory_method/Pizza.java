package lab6.abstract_factory_method;

import java.util.ArrayList;

public abstract class Pizza {
  private String name;
  private Dough dough;
  private Sauce sauce;
  private Cheese cheese;
  private Pepperoni pepperoni;
  private Clams clams;
  private ArrayList<Veggies> veggies;

  public abstract void prepare();

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("---- " + name + " ----\n");
    if (dough != null) {
      result.append(dough);
      result.append("\n");
    }
    if (sauce != null) {
      result.append(sauce);
      result.append("\n");
    }
    if (cheese != null) {
      result.append(cheese);
      result.append("\n");
    }
    if (veggies != null) {
      for (int i = 0; i < veggies.size(); i++) {
        result.append(veggies.get(i));
        if (i < veggies.size() - 1) {
          result.append(", ");
        }
      }
      result.append("\n");
    }
    if (clams != null) {
      result.append(clams);
      result.append("\n");
    }
    if (pepperoni != null) {
      result.append(pepperoni);
      result.append("\n");
    }
    return result.toString();
  }

  public void setDough(Dough dough) {
    this.dough = dough;
  }

  public void setSauce(Sauce sauce) {
    this.sauce = sauce;
  }

  public void setCheese(Cheese cheese) {
    this.cheese = cheese;
  }

  public void setPepperoni(Pepperoni pepperoni) {
    this.pepperoni = pepperoni;
  }

  public void setClams(Clams clams) {
    this.clams = clams;
  }

  public void setVeggies(ArrayList<Veggies> veggies) {
    this.veggies = veggies;
  }

}
