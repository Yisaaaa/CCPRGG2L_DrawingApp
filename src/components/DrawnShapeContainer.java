package components;


import javax.swing.*;
import java.awt.*;

public class DrawnShapeContainer extends JPanel {

    JPanel shape;
    JLabel outputText;

    public DrawnShapeContainer() {
        this.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(null);
        this.setOpaque(true);

        shape = new JPanel();
        shape.setMaximumSize(new Dimension(400, 400));
        shape.setPreferredSize(new Dimension(400, 400));
        shape.setMinimumSize(new Dimension(400, 400));
        shape.setBackground(Color.white);
        shape.setOpaque(true);
        shape.setAlignmentX(CENTER_ALIGNMENT);

        this.add(shape);
        this.add(Box.createRigidArea(new Dimension(0, 30)));

        outputText = new JLabel("You drew a Circle with a Pen!");
        outputText.setFont(new Font("Rubik", Font.BOLD, 22));
        outputText.setForeground(Color.white);
        outputText.setAlignmentX(CENTER_ALIGNMENT);

        this.add(outputText);
    }
}
