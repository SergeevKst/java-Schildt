package chapter03.array;

import java.util.Arrays;

public class Array {
    public static void showArray() {
        int [] month_days;
        month_days = new int[4];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;

        Arrays.stream(month_days)
                .forEach(System.out::println);
    }
}
