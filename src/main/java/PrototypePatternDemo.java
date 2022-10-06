public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadMap();

        Shape clone_shape_1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Cloned shape 1 is " + clone_shape_1.getType());

        Shape clone_shape_2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Cloned shape 2 is " + clone_shape_2.getType());

        Shape clone_shape_3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Cloned shape 3 is " + clone_shape_3.getType());

    }
}
