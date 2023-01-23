package chapter09.alpha;

public interface Alpha {
    default void reset() {
        System.out.println("Alpha");
    }
}
