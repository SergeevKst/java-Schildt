package chapter05;

public class Return {
    public static void showReturn() {
        boolean t = true;
        System.out.println("До возврата.");
        if (t) return;

        System.out.println("Этот оператор не выполнится.");
    }
}
