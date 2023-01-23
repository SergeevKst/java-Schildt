
package chapter05;

public class BreakToLabel {
    public static void showLabel(){
        exit: for (int i = 0; i < 3; i++) {
                System.out.print("Проход " + i + ": ");
                for (int j = 0; j < 100; j++) {
                    if (j == 10) break exit;
                    System.out.print(j + " ");
                }
                System.out.println("Эта строка не выводится");
              }
        System.out.println("Циклы завершены.");
    }
}
