import javax.swing.*;
import java.awt.*;

public class Square implements Shape{

    DrawPanel drawPanel;
    int x;
    int y;
    int side;
    Color color;

    public Square(int x, int y, int side, DrawPanel drawPanel, Color color) {
        this.x = x;
        this.y = y;
        this.side = side;
        this.drawPanel = drawPanel;
        this.color = color;
    }

    public void drawWith(Tool tool) {
        tool.useOnSquare(this);
    }


}