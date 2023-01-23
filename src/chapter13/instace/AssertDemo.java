package chapter13.instace;

public class AssertDemo {
    private static int val = 3;
    private static int getNum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++) {
            n = getNum();

            assert n > 0 : " n - отрицаетльоне!!! "; // не подтвердится, если n == О
            System.out.println("n равно " + n);
        }
    }
}
