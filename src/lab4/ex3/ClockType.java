package lab4.ex3;

import javax.swing.JComponent;

public abstract class ClockType extends JComponent {

    public abstract void updateData(ClockHandle data);

    public abstract void draw();

}
