
package chapter05;

public class NoBody {
    public static void showNoBody() {
        int i, j;
        i = 100;
        j = 200;

        while (++i < --j);
        System.out.println("Среднее значение равно " + i);
    }
}
