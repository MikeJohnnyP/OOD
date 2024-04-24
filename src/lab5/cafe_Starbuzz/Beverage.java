package lab5.cafe_Starbuzz;

public abstract class Beverage {
    protected StringBuilder description = new StringBuilder("Unknown Beverage");

    public String getDescription() {
        return description.toString();
    }

    public void setDescription(String description) {
        this.description.append(description);
    }

    public void clearDescription() {
        this.description.delete(0, description.length());
    }

    public abstract double cost();
}
