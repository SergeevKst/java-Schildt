package chapter06;

public class Rectangle {
    private final int firstFacet;
    private final int secondFacet;

    public int getFirstFacet() {
        return firstFacet;
    }

    public int getSecondFacet() {
        return secondFacet;
    }

    public Rectangle(int firstFacet, int secondFacet) {
        this.firstFacet = firstFacet;
        this.secondFacet = secondFacet;
    }
}
