package chapter17.package01;

// Пузырьковая сортировка объектов типа String

import java.util.Arrays;

class SortBoobleString {
    private static String[] strs = {"Now", "is", "the", "time", "for", "all",
                                    "good", "men", "to", "come", "to", "the",
                                    "aid", "of", "their", "country"};

    private static String[] getSort(String[] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareToIgnoreCase(str[j]) < 0) {
                    String k = str[i];
                    str[i] = str[j];
                    str[j] = k;
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("Исходный массив строк: " + Arrays.toString(strs));
        System.out.println("Отсортированный массив: " + Arrays.toString(getSort(strs)));
    }
}
