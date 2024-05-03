
public class Circle implements Shape {

    public void drawWith(Tool tool) {
        tool.useOnCircle(this);

    }
}