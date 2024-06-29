package lab8.ex4;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class TrianglePanel extends JPanel {
    ArrayList<Triangle> triangleList;

    public TrianglePanel() {
        triangleList = new ArrayList<Triangle>();
    }

    public void add(Triangle triangle) {
        triangleList.add(triangle);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        for (Triangle triangle : triangleList) {
            triangle.draw(g, Color.RED);
        }
    }
}
