public class ShapeMaker {
    Rectangle makeRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        return rectangle;
    }
    Triangle makeTriangle(){
        Triangle triangle = new Triangle();
        triangle.draw();
        return triangle;
    }
    Circle makeCircle(){
        Circle circle = new Circle();
        circle.draw();
        return circle;
    }
}
