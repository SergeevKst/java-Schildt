package chapter05;

public class BreakWhile {
    public static void showBreakWhile() {
        int i = 0;
        while (i < 3) {
            ++i;
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.print("прерываем вложенный цикл; \n");
        }
    }
}
