import components.DrawnShapeContainer;
import components.Sidebar;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    public App() {
        this.setTitle("Drawing App but not really...SMH");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x27272a));



        JPanel sidebar = new Sidebar();
        this.add(sidebar, BorderLayout.LINE_START);

        JPanel drawnShapeContainer = new DrawnShapeContainer();
        this.add(drawnShapeContainer, BorderLayout.CENTER);

        this.setVisible(true);
        this.pack();
    }

}