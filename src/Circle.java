import javax.swing.*;
import java.awt.*;

public class Circle implements Shape{

    DrawPanel drawPanel;
    int x;
    int y;
    int side;
    Color color;

    public Circle(int x, int y, int side, DrawPanel drawPanel, Color color) {
        this.x = x;
        this.y = y;
        this.side = side;
        this.drawPanel = drawPanel;
        this.color = color;
    }

    public void drawWith(Tool tool) {
        tool.useOnCircle(this);
    }


}