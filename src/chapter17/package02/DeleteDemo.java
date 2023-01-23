package chapter17.package02;

// Продемонстрировать применение методов delete() и deleteCharAt()

class DeleteDemo {
    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer("Этo простой тест.");
        System.out.println(strBuf);
        strBuf.delete(3, 11);
        System.out.println("Пocлe вызова метода delete(): " + strBuf);
        strBuf.deleteCharAt(0);
        System.out.println("Пocлe вызова метода deleteCharAt(): " + strBuf);
    }
}
