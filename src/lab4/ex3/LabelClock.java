package lab4.ex3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabelClock extends ClockType {
    private JLabel label = new JLabel();
    private JPanel panel = new JPanel();
    private int hour;
    private int minute;
    private int second;

    public LabelClock() {
        label = new JLabel();
        super.setPreferredSize(getPreferredSize());
        super.setSize(100, 100);
        super.setLayout(new BorderLayout());
        label.setLayout(new BorderLayout());
        label.setLayout(new BorderLayout());
        label.setFont(new Font("Serif", Font.PLAIN, 30));
        label.setForeground(Color.BLACK);
        label.setSize(100, 100);
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setSize(100, 100);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        label.setText("This label");
        panel.add(label, BorderLayout.CENTER);
        super.add(panel, BorderLayout.CENTER);
    }

    public Dimension getPreferredSize() {
        return new Dimension(Window.WIDTH, Window.HEIGHT / 2);
    }

    @Override
    public void updateData(ClockHandle data) {
        this.hour = data.getTime().getHour();
        this.minute = data.getTime().getMinute();
        this.second = data.getTime().getSecond();
    }

    @Override
    public void draw() {
        label.setText(hour + " : " + minute + " : " + second);
    }

}
