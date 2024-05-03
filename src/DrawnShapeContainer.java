import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawnShapeContainer extends JPanel  {

    DrawPanel shape;
    JLabel outputText;
    App parent;

    public DrawnShapeContainer(App parent) {
        this.parent = parent;
        this.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(null);
        this.setOpaque(true);



        this.shape = new DrawPanel(parent);


        this.add(shape);
        this.add(Box.createRigidArea(new Dimension(0, 30)));

        outputText = new OutputLabel("");
        this.add(outputText);
    }

    public void setOutputText(String newOutputText) {
        outputText.setText(newOutputText);
    }



}
