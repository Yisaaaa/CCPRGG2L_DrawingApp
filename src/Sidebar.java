import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class Sidebar extends JPanel implements ActionListener {

    // Shapes
    JPanel shapeBtnContainer;
    JLabel shapeBtnContainerLabel;
    JPanel shapeBtns;
    JButton circle;
    JButton square;
    ArrayList<JButton> shapes = new ArrayList<>();


    // Tools
    JPanel toolBtnContainer;
    JLabel toolBtnContainerLabel;
    JPanel toolBtns;
    JButton pen;
    JButton brush;
    ArrayList<JButton> tools = new ArrayList<>();

    // Color
    JPanel colorBtnContainer;
    JLabel colorBtnContainerLabel;
    JButton colorBtn;

    // Draw
    JButton drawBtn;

    private JButton shapeSelected;
    private Color colorSelected;
    private JButton toolSelected;

    App parent;

    public Sidebar(App parent) {
        this.parent = parent;
        this.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(null);
        this.setOpaque(true);

        // Adding the Shapes
        shapeBtnContainer = new JPanel();
        shapeBtnContainer.setLayout(new BoxLayout(shapeBtnContainer, BoxLayout.Y_AXIS));
        shapeBtnContainerLabel = new BtnContainerLabel();

        shapeBtnContainerLabel.setText("Shape");
        shapeBtnContainerLabel.setOpaque(true);
        shapeBtnContainer.add(shapeBtnContainerLabel);
        shapeBtnContainer.add(Box.createRigidArea(new Dimension(this.getWidth(), 10)));

        shapeBtns = new JPanel();
        shapeBtns.setLayout(new BoxLayout(shapeBtns, BoxLayout.LINE_AXIS));

        shapeBtns.setOpaque(true);
        shapeBtns.setAlignmentX(LEFT_ALIGNMENT);

        circle = new ButtonPrimary();
        circle.setText("Circle");
        circle.addActionListener(this);

        square = new ButtonPrimary();
        square.setText("Square");
        square.addActionListener(this);

        shapes.add(square);
        shapes.add(circle);


        shapeBtns.add(circle);
        shapeBtns.add(Box.createRigidArea(new Dimension(20, 0)));
        shapeBtns.add(square);
        shapeBtns.setBackground(null);
        shapeBtns.setOpaque(true);

        shapeBtnContainer.add(shapeBtns);

        shapeBtnContainer.setBackground(null);
        shapeBtnContainer.setOpaque(true);
        shapeBtnContainer.setAlignmentX(LEFT_ALIGNMENT);


        this.add(shapeBtnContainer);
        this.add(Box.createRigidArea(new Dimension(0, 50)));


        // Adding the tools
        toolBtnContainer = new JPanel();
        toolBtnContainer.setLayout(new BoxLayout(toolBtnContainer, BoxLayout.Y_AXIS));
        toolBtnContainer.setBackground(null);
        toolBtnContainer.setOpaque(true);

        toolBtnContainerLabel = new BtnContainerLabel();
        toolBtnContainerLabel.setText("Tool");

        toolBtnContainer.add(toolBtnContainerLabel);
        toolBtnContainer.add(Box.createRigidArea(new Dimension(0, 10)));

        toolBtns = new JPanel();
        toolBtns.setLayout(new BoxLayout(toolBtns, BoxLayout.X_AXIS));
        toolBtns.setAlignmentX(LEFT_ALIGNMENT);
        toolBtns.setBackground(null);
        toolBtns.setOpaque(true);



        pen = new ButtonPrimary();
        pen.setText("Pen");
        pen.addActionListener(this);

        brush = new ButtonPrimary();
        brush.setText("Brush");
        brush.addActionListener(this);

        tools.add(pen);
        tools.add(brush);

        toolBtns.add(pen);
        toolBtns.add(Box.createRigidArea(new Dimension(20, 0)));
        toolBtns.add(brush);

        toolBtnContainer.add(toolBtns);
        toolBtnContainer.setAlignmentX(LEFT_ALIGNMENT);

        this.add(toolBtnContainer);
        this.add(Box.createRigidArea(new Dimension(0, 50)));

        // Adding the color picker
        colorBtnContainer = new JPanel();
        colorBtnContainer.setLayout(new BoxLayout(colorBtnContainer, BoxLayout.Y_AXIS));
        colorBtnContainer.setBackground(null);
        colorBtnContainer.setOpaque(true);

        colorBtnContainerLabel = new BtnContainerLabel();
        colorBtnContainerLabel.setText("Color");

        colorBtn = new ButtonPrimary();
        colorBtn.setAlignmentX(LEFT_ALIGNMENT);
        colorBtn.setText("Choose");
        colorBtn.addActionListener(this);

        colorBtnContainer.add(colorBtnContainerLabel);
        colorBtnContainer.add(Box.createRigidArea(new Dimension(0, 10)));
        colorBtnContainer.add(colorBtn);

        this.add(colorBtnContainer);
        this.add(Box.createRigidArea(new Dimension(0, 70)));


        // Adding draw button
        drawBtn = new JButton("Click to draw!");
        drawBtn.setBackground(new Color(0xEBAC24));
        drawBtn.setForeground(Color.black);
        drawBtn.setFont(new Font("Rubik", Font.BOLD, 18));
        drawBtn.setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));
        drawBtn.setAlignmentX(LEFT_ALIGNMENT);
        drawBtn.setFocusable(false);
        drawBtn.addActionListener(this);

        this.add(drawBtn);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton source = (JButton) actionEvent.getSource();
        if (shapes.contains(source)) {
            for (JButton shape : shapes) {
                if (shape.equals(source)) {
                    setSelectedButton(shape);
                    setShapeSelected(shape);
                } else {
                    setUnselectedButton(shape);
                }
            }
        } else if (tools.contains(source)) {
            for (JButton tool : tools) {
                if (tool.equals(source)) {
                    setSelectedButton(tool);
                    setToolSelected(tool);
                } else {
                    setUnselectedButton(tool);
                }
            }
        } else if(colorBtn.equals(source)) {
                Color color = JColorChooser.showDialog(null, "Choose Color", Color.black);
                setColorSelected(color);
        } else if (drawBtn.equals(source)) {
            String outputText;
            if (shapeSelected == null || toolSelected == null) {
                outputText = "Please select a color or shape first";
            } else {
                outputText = String.format("You drew a %s with a %s!", shapeSelected.getText(), toolSelected.getText());
            }

            parent.getDrawnShapeContainer().setOutputText(new OutputLabel(outputText));
        }
    }

    public void setShapeSelected(JButton shapeSelected) {
        this.shapeSelected = shapeSelected;
    }

    public void setToolSelected(JButton toolSelected) {
        this.toolSelected = toolSelected;
    }

    public void setColorSelected(Color colorSelected) {
        this.colorSelected = colorSelected;
    }

    public JButton getShapeSelected() {
        return shapeSelected;
    }

    public JButton getToolSelected() {
        return toolSelected;
    }



    public void setSelectedButton(JButton btn) {
        btn.setBackground(new Color(0x2563eb));
        btn.setForeground(Color.white);
    }

    public void setUnselectedButton(JButton btn) {
        btn.setBackground(new Color(0xeff6ff));
        btn.setForeground(Color.black);
    }
}
