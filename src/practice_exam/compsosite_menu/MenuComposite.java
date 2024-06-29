package practice_exam.compsosite_menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MenuComposite extends MenuComponent {
    String name;
    String description;
    List menuComponent = new ArrayList<>();

    public MenuComposite(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        this.menuComponent.add(menuComponent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List getMenuComponent() {
        return menuComponent;
    }

    public void setMenuComponent(List menuComponent) {
        this.menuComponent = menuComponent;
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponent.get(i);
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(getDescription());
        System.out.println("------------------------");
        Iterator it = menuComponent.iterator();
        while (it.hasNext()) {
            Object component = it.next();
            // if (component instanceof MenuItem) {
            // MenuItem item = (MenuItem) component;
            // item.print();
            // } else {
            MenuComponent menuComponent = (MenuComponent) component;
            menuComponent.print();
            // }
        }

    }

}
