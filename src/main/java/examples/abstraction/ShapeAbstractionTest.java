package examples.abstraction;

public class ShapeAbstractionTest {
    public static void main(String[] args) {
        Shape circle = new Circle("Pink", 8.2);
        Shape rectangle = new Rectangle("Blue", 22, 44);

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
    }
}