package chapter07.satatic.nested;

public class Main {
    public static void main(String[] args) {
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass("Java");
        nestedClass.show();

        OuterClass outerClass = new OuterClass("Outer");
        OuterClass.NestedClass nested = new OuterClass.NestedClass("Nested");
        nested.show(outerClass);
    }
}
