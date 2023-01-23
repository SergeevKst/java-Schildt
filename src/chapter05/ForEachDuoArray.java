package chapter05;

public class ForEachDuoArray {
    public static void showForEachDuoArray() {
        int sum = 0;
        int[][] arrs = new int[3][5];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                arrs[i][j] = j + 1;


        for (int x[] : arrs) {
            for (int y : x) {
                System.out.print(y + " ");
                sum += y;
            }
            System.out.println();
        }
        System.out.println("Сумма: " + sum);
    }
}
