import javax.swing.*;
import java.awt.*;

public class ButtonPrimary extends JButton {
    public ButtonPrimary() {
        this.setBackground(new Color(0xeff6ff));
        this.setFont(new Font("Rubik", Font.BOLD, 16));
        this.setFocusable(false);
        this.setForeground(Color.black);
        this.setPreferredSize(new Dimension(100, 30));
        this.setMaximumSize(new Dimension(100, 30));
        this.setMinimumSize(new Dimension(100, 30));
        this.setBorder(null);

    }
}
