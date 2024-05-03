import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawPanel extends JPanel implements MouseListener{

    App parent;
    Sidebar sidebar;

    public DrawPanel(App parent) {
        this.parent = parent;
        this.sidebar = parent.sidebar;
        this.setMaximumSize(new Dimension(750, 750));
        this.setPreferredSize(new Dimension(750, 750));
        this.setMinimumSize(new Dimension(750, 750));
        this.setBackground(Color.white);
        this.setOpaque(true);
        this.setAlignmentX(CENTER_ALIGNMENT);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

        if (sidebar.getShapeSelected() == null || sidebar.getToolSelected() == null) {
            parent.getDrawnShapeContainer().setOutputText("Please select a tool and shape first");
            return;
        }

        int x = mouseEvent.getX();
        int y = mouseEvent.getY();

        int side = 100;

        System.out.println("clicked");

        String shapeSelected = sidebar.getShapeSelected().getText().toLowerCase();
        String toolSelected = sidebar.getToolSelected().getText().toLowerCase();
        Color colorSelected = sidebar.getColorSelected();

        if (shapeSelected.equals("square")) {
            if (toolSelected.equals("brush")) {
                Square square = new Square(x, y, side, this, colorSelected);
                square.drawWith(new Brush());
            } else if (toolSelected.equals("pen")) {
                Square square = new Square(x, y, side, this, colorSelected);
                square.drawWith(new Pen());
            }

        } else {
            if (toolSelected.equals("brush")) {
                Circle circle = new Circle(x, y, side, this, colorSelected);
                circle.drawWith(new Brush());
            } else if (toolSelected.equals("pen")) {
                Circle circle = new Circle(x, y, side, this, colorSelected);
                circle.drawWith(new Pen());
            }
        }
    }


    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
