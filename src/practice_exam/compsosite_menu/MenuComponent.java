package practice_exam.compsosite_menu;

public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {

    }

    public void remove(MenuComponent menuComponent) {

    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public double getPrice() {
        return 0;
    }

    public boolean isVegetarian() {
        return false;
    }

    public void print() {

    }
}
