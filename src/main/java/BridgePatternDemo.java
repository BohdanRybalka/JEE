public class BridgePatternDemo {
    public static void main(String[] args) {
        Circle circle_1 = new Circle(new RedPen(), 0, 1, 4);
        Circle circle_2 = new Circle(new GreenPen(), -4, 3, 13);

        circle_1.draw();
        circle_2.draw();
    }

}
