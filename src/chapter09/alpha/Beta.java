package chapter09.alpha;

public interface Beta extends Alpha {
    default void reset() {
        System.out.println("Beta");
    }
}
