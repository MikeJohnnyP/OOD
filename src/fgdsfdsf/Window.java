package fgdsfdsf;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
    JButton button;
    JPanel jpanel;

    public Window() {
        jpanel = new JPanel();
        // jpanel.setBounds(0, 0, 445, 600);
        jpanel.setBackground(Color.BLACK);
        this.setSize(445, 600);
        this.setLayout(new GridLayout(2, 1));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(jpanel);
        this.list();
        button = new JButton("PRESSED");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                change();
            }
        });
        // button.setBounds(23, 435, 100, 100);
        this.add(button);
        this.setResizable(false);
        this.setVisible(true);

    }

    public void change() {
        this.list();
        this.remove(jpanel);
        jpanel = new JPanel();
        jpanel.setBounds(0, 0, 445, 600);
        jpanel.setBackground(Color.BLUE);
        this.add(jpanel);
        jpanel.repaint();
        this.list();
    }

    public static void main(String[] args) {
        new Window();
    }
}

abstract class Panel extends JComponent {

}

class blueRec extends Panel {
    public blueRec() {
        this.setBounds(34, 43, 445, 600);
        this.setBackground(Color.BLUE);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(445, 600);
    }

}

class redRec extends Panel {
    public redRec() {
        this.setBounds(0, 0, 445, 600);
        this.setBackground(Color.RED);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(445, 600);
    }
}