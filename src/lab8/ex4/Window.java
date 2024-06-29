package lab8.ex4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class Window extends JFrame {
    TrianglePanel panel;

    public Window() {
        super("Draw triangle");
        panel = new TrianglePanel();
        panel.add(new StdTriangle(new Point(10, 10), new Point(250, 10), new Point(10, 250)));
        panel.add(new IsocelesTriangle(new Point(150, 100), new Point(240, 40),
                new Point(175, 150)));
        add(panel);
        setSize(new Dimension(500, 500));
        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String agrs[]) {
        new Window();
    }
}
