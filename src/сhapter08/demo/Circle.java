package сhapter08.demo;

public class Circle extends Figure {
    private final int radius;

    @Override
    public double getArea() {
        return radius * Math.PI;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}
