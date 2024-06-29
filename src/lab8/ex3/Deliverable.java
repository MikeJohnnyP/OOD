package lab8.ex3;

public class Deliverable extends ProjectItem {
    private double materialCost;
    private double porductionTime;

    protected Deliverable(String name, String description, double rate, double materialCost, double porductionTime) {
        super(name, description, rate);
        this.materialCost = materialCost;
        this.porductionTime = porductionTime;
    }

    @Override
    double getTimeRequired() {
        return porductionTime;
    }

    @Override
    double getMaterialCost() {
        return materialCost;
    }

}
