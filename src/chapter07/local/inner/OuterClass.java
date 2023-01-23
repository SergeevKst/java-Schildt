package chapter07.local.inner;

import java.util.Comparator;

public class OuterClass {
    private boolean reverse;

    public OuterClass(boolean reverse) {
        this.reverse = reverse;
    }

    public OuterClass() {
    }

    public Comparator<String> getComparator() {
        class StringComparator implements Comparator<String> {
            @Override
            public int compare(String o1, String o2) {
                if (!OuterClass.this.reverse) {
                    System.out.println("Показана возможность доступа к полям Outer class");
                }
                return o1.length() - o2.length();
            }
        }
        return new StringComparator();
    }
}
