package lab6.simple_pizza_factory;

import java.util.ArrayList;

public abstract class Pizza {
  private String name;
  private String dough;
  private String sauce;
  private ArrayList<String> toppings = new ArrayList<String>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDough() {
    return dough;
  }

  public void setDough(String dough) {
    this.dough = dough;
  }

  public String getSauce() {
    return sauce;
  }

  public void setSauce(String sauce) {
    this.sauce = sauce;
  }

  public ArrayList<String> getToppings() {
    return toppings;
  }

  public void setToppings(ArrayList<String> toppings) {
    this.toppings = toppings;
  }

  public void addTopping(String topping) {
    toppings.add(topping);
  }

  public void bake() {
    System.out.println("Baking: " + name);
  }

  public void prepare() {
    System.out.println("Preparing: " + name);
  }

  public void cut() {
    System.out.println("Cutting: " + name);
  }

  public void box() {
    System.out.println("Boxing: " + name);
  }

}
