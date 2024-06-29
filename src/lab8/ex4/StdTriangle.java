package lab8.ex4;

import java.awt.Graphics;
import java.awt.Point;

public class StdTriangle extends Triangle {

    protected StdTriangle(Point a, Point b, Point c) {
        super(a, b, c);
    }

    @Override
    Point draw2ndLine(Point a, Point b, Graphics g) {
        g.drawLine(a.x, a.y, b.x, b.y);
        return b;
    }

}
