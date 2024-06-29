package lab8.ex3;

public abstract class ProjectItem {
    protected String name;
    protected String description;
    protected double rate;

    protected ProjectItem(String name, String description, double rate) {
        this.name = name;
        this.description = description;
        this.rate = rate;
    }

    double getCostEstimate() {
        return 0.f;
    }

    abstract double getTimeRequired();

    abstract double getMaterialCost();
}