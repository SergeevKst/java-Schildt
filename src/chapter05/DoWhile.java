package chapter05;

public class DoWhile {
    public static void showDoWhile() {
        int n = 10;
        do {
            System.out.println("Число такта " + n);
        } while (--n > 0);
    }
}
