package more_ex;

public class Main {
    public static void main(String[] args) {
        Beverage cup1 = new Tea();
        cup1.prepare();

        cup1 = new HotChocolate();
        cup1.prepare();

        Beverage cup2 = new Coffee();
        cup2.prepare();
    }
}
