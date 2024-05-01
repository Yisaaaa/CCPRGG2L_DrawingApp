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
        shape.setMaximumSize(new Dimension(450, 450));
        shape.setPreferredSize(new Dimension(450, 450));
        shape.setMinimumSize(new Dimension(450, 450));
        shape.setBackground(Color.white);
        shape.setOpaque(true);
        shape.setAlignmentX(CENTER_ALIGNMENT);

        this.add(shape);
        this.add(Box.createRigidArea(new Dimension(0, 30)));

        outputText = new OutputLabel("");
        this.add(outputText);
    }

    public void setOutputText(JLabel newOutputText) {
        this.remove(outputText);
        this.outputText = newOutputText;
        this.add(newOutputText);
        this.revalidate();
        this.repaint();
    }
}
