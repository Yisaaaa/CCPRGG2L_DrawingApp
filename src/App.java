
import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    Sidebar sidebar;
    DrawnShapeContainer drawnShapeContainer;

    public App() {
        this.setTitle("Drawing App but not really...SMH");
//        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x27272a));



        sidebar = new Sidebar(this);
        this.add(sidebar, BorderLayout.LINE_START);

        drawnShapeContainer = new DrawnShapeContainer(this);
        this.add(drawnShapeContainer, BorderLayout.CENTER);

        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public DrawnShapeContainer getDrawnShapeContainer() {
        return drawnShapeContainer;
    }
}
