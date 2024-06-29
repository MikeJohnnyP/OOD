package practice_exam.compsosite_menu;

public class TestDrive {
    public static void main(String[] args) {
        MenuComponent it1 = new MenuItem("dfsd", "fdsf", true, 43.0);
        MenuComponent it2 = new MenuItem("dfsd", "fdsf", true, 43.0);
        MenuComponent it3 = new MenuItem("dfsd", "fdsf", true, 43.0);

        MenuComponent menu = new MenuComposite("fdsf", "fdsf");
        menu.add(it1);
        menu.add(it2);
        menu.add(it3);

        menu.print();

    }
}
