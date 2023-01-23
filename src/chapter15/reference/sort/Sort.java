package chapter15.reference.sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String[] words = new String[]{"Reference", "String", "Compare"};
        Arrays.sort(words, Sort::compareString);
        System.out.println(Arrays.toString(words));

    }

    public static int compareString(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
