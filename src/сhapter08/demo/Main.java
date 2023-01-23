package сhapter08.demo;

public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(25, 15);
        Figure circle = new Circle(27);

        System.out.println("Rectangle are: " + rectangle.getArea());
        System.out.println("Circle are: " + circle.getArea());
    }
}
