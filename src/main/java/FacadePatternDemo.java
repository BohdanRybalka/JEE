public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        Rectangle rectangle = shapeMaker.makeRectangle();
        System.out.println();

        Triangle triangle = shapeMaker.makeTriangle();
        System.out.println();

        Circle circle = shapeMaker.makeCircle();

    }
}
