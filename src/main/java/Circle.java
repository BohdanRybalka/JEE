public class Circle extends Shape {
    private int x;
    private int y;
    private double radius;

    public Circle(DrawingAPI drawingAPI, int x, int y, double radius) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
        drawingAPI.drawCircle();
    }
}
