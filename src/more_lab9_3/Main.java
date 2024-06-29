package more_lab9_3;

public class Main {
    public static void main(String[] args) {
        // add task group
        TaskGroup taskGroup = new TaskGroup();
        taskGroup.add(new Task());
        taskGroup.add(new Task());
        taskGroup.add(new Task());
        taskGroup.add(new Task());
        taskGroup.add(new Task());

        taskGroup.display();

    }
}
