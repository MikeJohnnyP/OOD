package lab8.ex1;

public class Main {
    public static void main(String[] args) {
        StringDecorator decorator = new NumberDecorator();
        decorator.decorate("Hello, hallo");

        decorator = new SymbolDecorator();
        decorator.decorate("Try T poses");

        decorator.decorate("Wrote some text");
    }
}
