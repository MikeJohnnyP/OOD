package lab4.ex3;

import java.awt.BorderLayout;
import java.util.Random;

import javax.swing.JFrame;

public class Window extends JFrame {
    private JFrame window;
    private ClockType clockType;
    public static int WIDTH = 200;
    public static int HEIGHT = 200;
    private Random r = new Random();

    public Window(ClockType clockType, String title) {
        this.clockType = clockType;
        window = new JFrame(title);
        window.setPreferredSize(clockType.getPreferredSize());
        window.setLayout(new BorderLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(clockType, BorderLayout.CENTER);
        window.pack();
        window.setLocation(r.nextInt(640), r.nextInt(480));
        window.setVisible(true);

    }

    public void show(ClockHandle data) {
        clockType.updateData(data);
        clockType.draw();
    }

    public void setComponent(ClockType clockType) {
        this.clockType = clockType;
    }

}
