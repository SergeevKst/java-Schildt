package chapter07.anonymous.inner.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        String[] arr = {"Mark", "Kiril", "Konstantin", "Oliy"};

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Arrays.sort(arr, comparator);
        System.out.println(Arrays.toString(arr));
    }
}
