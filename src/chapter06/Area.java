package chapter06;

public class Area {
    Rectangle rectangle;

    public void showAre(){
        System.out.println(rectangle.getFirstFacet() * rectangle.getSecondFacet());
    }

    public Area(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
}
