package chapter03.array;

public class Main {
    public static void main(String[] args) {
        showAllArrays();
    }

    private static void showAllArrays() {
        System.out.println("Show simple array");
        Array.showArray();

        System.out.println("Show Average");
        Average.showAverage();

        System.out.println("Count day");
        CountDayArray.showCountDay();

        System.out.println("Show duo array");
        DuoArray.showDuoArray();

        System.out.println("Show matrix");
        Matrix.showMatrix();

        System.out.println("Show three array");
        ThreeArray.showThreeArray();
    }
}
