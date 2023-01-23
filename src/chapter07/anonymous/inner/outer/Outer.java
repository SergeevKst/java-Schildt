package chapter07.anonymous.inner.outer;

public class Outer {
    private String text;

    private Comparable<String> comparator = new Comparable<String>() {
        @Override
        public int compareTo(String o1) {
            return Outer.this.text.compareTo(o1);
        }
    };

    public Outer(String text) {
        this.text = text;
    }

    public Comparable<String> getComparator() {
        return comparator;
    }
}
