package chapter17.package02;

// Продемонстрировать применение метода insert()

class InsertDemo {
    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer("Hello!");
        strBuf.insert(5, " Java");
        System.out.println(strBuf);
    }
}
