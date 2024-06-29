package lab8.ex3;

public class Main {
    public static void main(String args[]) {
        Task someTask = new Task("Do something", "Learn everything", 14.0, 13);
        someTask.addProjectItem(new Deliverable("Two container", "don't take them hard", 32, 45, 67));

        someTask.addProjectItem(new Task("Workout", "25 minutes for everyday", 12, 45));
        someTask.addProjectItem(new Deliverable("Delivery some empty bottle ", "be careful", 32, 45, 67));
        System.out.println(someTask.getTimeRequired());
        System.out.println(someTask.getMaterialCost());

    }
}
