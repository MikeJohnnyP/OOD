package lab5_extra.online_shopping_plaform;

public class GraphicCard extends AddOns {

    public GraphicCard(BaseProduct baseProduct) {
        super(baseProduct);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "GraphicCard, ";
    }

    @Override
    public double cost() {
        return super.cost() + 50;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Addons: " + getDescription() + "\nCost: $" + cost();
    }

}
