package chapter04;

public class Ternary {
    public static void showTernary() {
        System.out.println("Применение тернарной операции ? \n");
        int i,k;

        i = 10;
        k = i < 0 ? -i : i;
        System.out.println("Абсолютное значение " + i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("Абсолютное значение " + i + " равно " + k);
    }
}
