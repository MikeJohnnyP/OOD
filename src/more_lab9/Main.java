package more_lab9;

public class Main {
    public static void main(String[] args) {
        CompositeGraphics compositeGraphics = new CompositeGraphics();
        compositeGraphics.add(new Circle());
        compositeGraphics.add(new Square());
        compositeGraphics.display();

        CompositeGraphics compositeGraphics1 = new CompositeGraphics();
        compositeGraphics1.add(new Circle());
        compositeGraphics1.add(new Square());
        compositeGraphics1.add(compositeGraphics);
        compositeGraphics1.display();

    }
}
