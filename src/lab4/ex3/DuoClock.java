package lab4.ex3;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;

public class DuoClock extends ClockType {
    private ClockType clock1;
    private ClockType clock2;

    public DuoClock(ClockType clock1, ClockType clock2) {
        this.clock1 = clock1;
        this.clock2 = clock2;
        super.setLayout(new BoxLayout(this, (int) BoxLayout.Y_AXIS));
        super.setSize(getPreferredSize());
        super.add(clock1);
        super.add(Box.createVerticalGlue());
        super.add(clock2, BorderLayout.SOUTH);
    }

    @Override
    public void updateData(ClockHandle data) {
        clock1.updateData(data);
        clock2.updateData(data);
        ;
    }

    @Override
    public void draw() {
        clock1.draw();
        clock2.draw();
    }

}
