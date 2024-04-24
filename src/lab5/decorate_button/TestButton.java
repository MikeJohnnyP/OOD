package lab5.decorate_button;

import javax.swing.JButton;

public class TestButton {
    public static void main(String[] args) {
        Window window = new Window(new CrossDeco(new JButton("CrossButton")));
        window.addButton(new HoldDeco(new JButton("Dtest")));
        window.addButton(new IconDeco(new JButton("Facebook"), "src/lab5/decorate_button/facebook.png"));
    }
}
