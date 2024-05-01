package components;

import javax.swing.*;
import java.awt.*;

public class BtnContainerLabel extends JLabel {
    public BtnContainerLabel() {
        this.setForeground(Color.white);
        this.setFont(new Font("Rubik", Font.BOLD, 20));
        this.setAlignmentX(LEFT_ALIGNMENT);
        this.setBackground(null);
    }
}
