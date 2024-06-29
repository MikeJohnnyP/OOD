package more_lab10.view;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import more_lab10.model.IModelAdapter;

public class View implements IView {
    IModelAdapter model;
    JFrame window;
    JTextField field1, field2;
    JComboBox<String> combo1, combo2;
    String[] selected = { "C", "F" };
    boolean field1boo = false, field2boo = false;
    Double result = 0.0;

    @Override
    public void setModel(IModelAdapter model) {
        this.model = model;
    }

    @Override
    public void initiallize() {
        window = new JFrame("Convert Degree");
        field1 = new JTextField(10);
        field2 = new JTextField(10);
        combo1 = new JComboBox<>(selected);
        combo2 = new JComboBox<>(selected);
        combo2.setSelectedIndex(1);

        combo1.setSelectedItem(0);
        combo2.setSelectedItem(0);

        field1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                field1boo = true;
                field2boo = false;
                setConvert();
                update();
                System.out.println(1);
                System.out.println("Ket qua: " + result);
                System.out.println(field1.getText());
            }
        });
        field2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                field1boo = false;
                field2boo = true;
                setConvert();
                update();
                System.out.println(2);
                System.out.println("Ket qua: " + result);
            }
        });
        window.setLayout(new GridLayout(2, 1));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        window.add(combo1);
        window.add(combo2);
        window.add(field1);
        window.add(field2);
        window.pack();
        window.setResizable(false);
        window.setVisible(true);

    }

    void setConvert() {
        if (field1boo) {
            if (combo1.getSelectedIndex() == 0 && combo2.getSelectedIndex() == 1) {
                result = model.getDegreeCtoF(Double.parseDouble(field1.getText()));
            } else if (combo1.getSelectedIndex() == 1 && combo2.getSelectedIndex() == 0) {
                result = model.getDegreeFtoC(Double.parseDouble(field1.getText()));
            }

        } else if (field2boo) {
            if (combo1.getSelectedIndex() == 0 && combo2.getSelectedIndex() == 1) {
                result = model.getDegreeFtoC(Double.parseDouble(field2.getText()));
            } else if (combo1.getSelectedIndex() == 1 && combo2.getSelectedIndex() == 0) {
                result = model.getDegreeCtoF(Double.parseDouble(field2.getText()));
            }
        }
    }

    @Override
    public void update() {
        if (combo1.getSelectedIndex() == combo2.getSelectedIndex()) {
            if (field1boo == true && field2boo == false) {
                field2.setText(field1.getText());
            } else if (field1boo == false && field2boo == true) {
                field1.setText(field2.getText());
            }
        } else {
            if (field1boo)
                field2.setText(String.format("%.2f", result));
            else
                field1.setText(String.format("%.2f", result));
        }
    }

}
