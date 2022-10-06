import java.util.HashMap;

public class ShapeCache {
    private static final HashMap<String, Shape> shapesMap = new HashMap<String, Shape>();

    public static Shape getShape(String id) {
        Shape cachedShape = shapesMap.get(id);

        return (Shape) cachedShape.clone();
    }

    public static void loadMap() {

        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapesMap.put(rectangle.getId(), rectangle);

        Circle circle = new Circle();
        circle.setId("2");
        shapesMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("3");
        shapesMap.put(square.getId(), square);

    }
}
