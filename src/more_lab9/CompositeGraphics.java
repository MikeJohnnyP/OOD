package more_lab9;

import java.util.ArrayList;
import java.util.Iterator;

public class CompositeGraphics extends Graphics {
    ArrayList<Graphics> menuGraphics = new ArrayList<>();

    @Override
    void add(Graphics g) {
        menuGraphics.add(g);
    }

    @Override
    void remove(Graphics g) {
        menuGraphics.remove(g);
    }

    @Override
    void display() {
        Iterator iterator = (Iterator) menuGraphics.iterator();
        while (iterator.hasNext()) {
            Graphics graphics = (Graphics) iterator.next();
            graphics.display();
        }
    }

}
