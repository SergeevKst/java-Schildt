package сhapter08.demo;

public class Rectangle extends Figure {
    private final int firstFacet;
    private final int secondFacet;

    @Override
    public double getArea() {
        return firstFacet * secondFacet;
    }

    public Rectangle(int firstFacet, int secondFacet) {
        this.firstFacet = firstFacet;
        this.secondFacet = secondFacet;
    }
}
