package chapter07.anonymous.inner.outer;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer("Comparator");
        System.out.println(outer.getComparator().compareTo("CompareTo"));
    }
}
