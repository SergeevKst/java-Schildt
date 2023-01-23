package chapter17.package02;

// Продемонстрировать применение метода replace()

class ReplaceDemo {
    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer("Этo простой тест.");
        System.out.println(strBuf);
        strBuf.replace(4, 11, "был");
        System.out.println("После замены: " + strBuf);
    }
}
