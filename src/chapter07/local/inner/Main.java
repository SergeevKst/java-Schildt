package chapter07.local.inner;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.getComparator().compare("Konstantin", "Max"));
    }
}
