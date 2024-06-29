package more_ex2;

public class Main {
    public static void main(String[] args) {
        Course n = new Lab();
        n.start();

        n = new Seminar();
        n.start();

        Course n2 = new Letures();
        n2.start();
    }
}
