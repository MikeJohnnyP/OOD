package lab5.decorate_button;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame implements ActionListener {
    JButton quit;
    JPanel jp;

    public Window(Decorator d) {
        super("My Decorated Window");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        jp = new JPanel();
        add(jp);
        jp.add(d);
        jp.add(new HoldDeco(new IconDeco(new JButton("corss"), "src/lab5/decorate_button/google.png")));
        jp.add(quit = new JButton("Quit"));
        jp.add(new CrossDeco(new IconDeco(new JButton("icon"), "src/lab5/decorate_button/java.jpg")));
        quit.addActionListener(this);
        setSize(new Dimension(600, 600));
        setVisible(true);
        quit.requestFocus();
    }

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    public void addButton(Decorator decorator) {
        jp.add(decorator);
        setVisible(true);
    }

}