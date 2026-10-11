import shapes.Circle;
import shapes.Rectangle;
public class ShapesPackageMain {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        System.out.printf("Circle area: %.2f%n", circle.area());
        System.out.printf("Rectangle area: %.2f%n", rectangle.area());
    }
}
