package components;

import javax.swing.*;
import java.awt.*;

public class Sidebar extends JPanel {

    // Shapes
    JPanel shapeBtnContainer;
    JLabel shapeBtnContainerLabel;
    JPanel shapeBtns;
    JButton circle;
    JButton square;


    // Tools
    JPanel toolBtnContainer;
    JLabel toolBtnContainerLabel;
    JPanel toolBtns;
    JButton pen;
    JButton brush;

    // Color
    JPanel colorBtnContainer;
    JLabel colorBtnContainerLabel;
    JButton colorBtn;

    // Draw
    JButton drawBtn;

    public Sidebar() {
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

        square = new ButtonPrimary();
        square.setText("Square");


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

        brush = new ButtonPrimary();
        brush.setText("Brush");

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

        this.add(drawBtn);

    }
}
