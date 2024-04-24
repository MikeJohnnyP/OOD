package lab5.decorate_button;

import javax.swing.JComponent;
import java.awt.BorderLayout;

public class Decorator extends JComponent {

    public Decorator(JComponent component) {
        setLayout(new BorderLayout());
        add("Center", component);
    }
}
