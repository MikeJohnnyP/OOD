package lab8.ex4;

import java.awt.*;

public abstract class Triangle {
    protected Point p1, p2, p3;

    protected Triangle(Point a, Point b, Point c) {
        p1 = a;
        p2 = b;
        p3 = c;
    }

    void draw(Graphics g, Color color) {
        g.setColor(color);
        drawLine(p1, p2, g);
        Point current = draw2ndLine(p2, p3, g);
        closeTriangle(current, g);

    }

    void drawLine(Point p1, Point p2, Graphics g) {
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
    }

    abstract Point draw2ndLine(Point a, Point b, Graphics g);

    void closeTriangle(Point c, Graphics g) {
        g.drawLine(c.x, c.y, p1.x, p1.y);
    }

}
