package lab8.ex3;

import java.util.ArrayList;

public class Task extends ProjectItem {
    private double taskTimeRequired;
    private ArrayList<ProjectItem> projectItems;

    protected Task(String name, String description, double rate, double taskTimeRequired) {
        super(name, description, rate);
        projectItems = new ArrayList<>();
        this.taskTimeRequired = taskTimeRequired;
    }

    public void addProjectItem(ProjectItem item) {
        if (!projectItems.contains(item)) {
            projectItems.add(item);
        }
    }

    @Override
    double getTimeRequired() {
        double totalTime = taskTimeRequired;
        for (ProjectItem i : projectItems) {
            totalTime += i.getTimeRequired();
        }

        return totalTime;
    }

    @Override
    double getMaterialCost() {
        double totalCost = 0;
        for (ProjectItem i : projectItems) {
            totalCost += i.getMaterialCost();
        }

        return totalCost;
    }

}
