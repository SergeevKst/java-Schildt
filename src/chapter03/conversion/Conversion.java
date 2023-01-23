package chapter03.conversion;

public class Conversion {
    public static void showConversion() {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\n Преобразование типа int в byte.");
        b = (byte) i;
        System.out.println("i , b : " + i + " , " + b);

        System.out.println("\n Преобразование типа double в int.");
        i = (int) d;
        System.out.println("d , i : " + d + " , " + i);

        System.out.println("\n Преобразование типа double в byte.");
        b = (byte) d;
        System.out.println("d , b : " + d + " , " + b);
    }
}
