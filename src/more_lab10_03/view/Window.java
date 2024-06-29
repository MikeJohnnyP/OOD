package more_lab10_03.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import more_lab10_03.Controller.IController;
import more_lab10_03.Controller.Controller;

public class Window extends JFrame {
    IController controller;
    JTextArea textArea = new JTextArea();
    JButton btnDetail = new JButton("Detail");
    JButton btnSimple = new JButton("Simple");

    public Window(IController controller) {
        this.controller = controller;
        this.setSize(800, 500);
        this.setLayout(new BorderLayout());
        textArea.setEditable(false);
        textArea.setFont(textArea.getFont().deriveFont(15.0f));
        btnDetail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(controller.getDetailList());
            }
        });
        btnSimple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(controller.getSimpleList());
            }
        });
        add(textArea, BorderLayout.CENTER);
        add(btnDetail, BorderLayout.EAST);
        add(btnSimple, BorderLayout.WEST);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        IController controller = new Controller();
        Window window = new Window(controller);
    }
}
