package lab4.ex3;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class CircleClock extends ClockType {
    private int hour;
    private int minute;
    private int second;

    public CircleClock() {
        super.setBounds(0, 0, Window.WIDTH, Window.HEIGHT);
        super.setLayout(new BorderLayout());
    }

    @Override
    public void updateData(ClockHandle data) {
        if (data.getTime().getHour() > 12) {
            this.hour = data.getTime().getHour() - 12;
            this.minute = data.getTime().getMinute();
            this.second = data.getTime().getSecond();
        } else {
            this.hour = data.getTime().getHour();
            this.minute = data.getTime().getMinute();
            this.second = data.getTime().getSecond();
        }
        draw();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = Math.min(centerX, centerY) - 6;
        g2d.setColor(Color.BLACK);
        g2d.drawRect(0, 0, this.getWidth(), this.getHeight());
        g2d.setColor(Color.BLACK);
        g2d.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
        drawHand(g2d, centerX, centerY, hour * 30, radius * 0.4, 4);
        drawHand(g2d, centerX, centerY, minute * 6, radius * 0.6, 2);
        drawHand(g2d, centerX, centerY, second * 6, radius * 0.8, 1);
    }

    public void drawHand(Graphics2D g2d, int centerX, int centerY, double angleDegree, double length, int thickness) {
        double angleRadian = Math.toRadians(angleDegree - 90);
        double x = centerX + length * Math.cos(angleRadian);
        double y = centerY + length * Math.sin(angleRadian);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.draw(new Line2D.Double(centerX, centerY, x, y));
    }

    public Dimension getPreferredSize() {
        return new Dimension(Window.WIDTH, Window.HEIGHT);
    }

    @Override
    public void draw() {
        repaint();
    }

}
