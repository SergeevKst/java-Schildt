package сhapter12.box;

public class AutoBox {
    public static void main(String[] args) {
        Integer iOb = m(100);
        System.out.println(iOb);
    }

    public static int m(Integer v) {
        return v;
    }
}
