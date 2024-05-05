import javax.swing.*;
import java.awt.*;

public class Brush implements Tool {


    @Override
    public void useOnCircle(Circle circle) {
        Graphics g = circle.drawPanel.getGraphics();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        int x = circle.x;
        int y = circle.y;
        int side = circle.side;
        Color color = circle.color;

        circle.drawPanel.parent.getDrawnShapeContainer().setOutputText("You drew a Circle with a Brush!");

        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(6));
        g2d.drawOval(x - (side/2), y - (side / 2), side, side);
        
    }



    @Override
    public void useOnSquare(Square square) {
        Graphics g = square.drawPanel.getGraphics();
        Graphics2D g2d = (Graphics2D) g;

        int x = square.x;
        int y = square.y;
        int side = square.side;
        Color color = square.color;

        square.drawPanel.parent.getDrawnShapeContainer().setOutputText("You drew a Square with a Brush!");

        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(6));
        g2d.drawRect(x - (side/2), y - (side / 2), side, side);
    }
}