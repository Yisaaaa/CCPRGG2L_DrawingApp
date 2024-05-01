import javax.swing.*;
import java.awt.*;

public class OutputLabel extends JLabel {

    public OutputLabel(String outputText) {
        this.setText(outputText);
        this.setFont(new Font("Rubik", Font.BOLD, 24));
        this.setForeground(Color.white);
        this.setAlignmentX(CENTER_ALIGNMENT);
    }
}
