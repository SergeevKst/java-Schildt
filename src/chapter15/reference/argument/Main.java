package chapter15.reference.argument;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"Reference", "String", "Compare"};
        mod(words, String::toUpperCase);
        System.out.println(Arrays.toString(words));

    }

    public static void mod(String[] arr, Modification modification) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = modification.modification(arr[i]);
        }
    }
}