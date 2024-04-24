package lab5_extra.burger_shop;

public class TestBurgerShop {
    public static void main(String[] args) {
        Burger burger = new TeriyakyBurger();
        burger = new Cheese(burger);
        burger = new ChiliSauce(burger);
        burger = new Mozzarella(burger);
        System.out.println(burger);

        System.out.println("====================================");

        Burger burger2 = new ChicagoBurger();
        burger2 = new Cheese(new SoySauce(burger2));
        System.out.println(burger2);

        System.out.println("====================================");

        Burger burger3 = new SteakBurger();
        burger3 = new Cheese(burger3);
        burger3 = new ChiliSauce(burger3);
        System.out.println(burger3);
    }

}
