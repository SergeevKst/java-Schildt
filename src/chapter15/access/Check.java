package chapter15.access;

/*
Лямбда функция имеет доступ к полям класса
Лямбда в static контексте имеет доступ к static полям и методам
Local Лямбда функция имеет доступ к local final or effective final переменным
 */
public class Check {

    private static final int[] staticArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    private static final Sum sum1 = () -> getArr();
    private int[] arr;

    private final Sum sum = () -> {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];

        }
        return result;
    };

    public static Sum getStaticSum() {
        return sum1;
    }

    public static int getArr() {
        return staticArr.length;
    }

    public Check(int[] arr) {
        this.arr = arr;
    }

    public Sum getSum() {
        return this.sum;
    }

    @Override
    public String toString() {
        return "Check{" +
                "sum=" + sum +
                '}';
    }
}
