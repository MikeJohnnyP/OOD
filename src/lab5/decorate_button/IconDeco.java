package lab5.decorate_button;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.Buffer;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

public class IconDeco extends Decorator {
    ImageIcon icon;
    JButton thisComp;

    public IconDeco(JComponent component, String path) {
        super(component);
        thisComp = (JButton) component;
        try {
            icon = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
            thisComp.setIcon(icon);
            System.out.println("Load img success");
        } catch (Exception e) {
            System.out.println("Icon not found");
        }
    }
}
