package chapter17.package02;

// Демонстрация методов length() и capacity() из класса StringBuffer

class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer("Строка");
        System.out.println("Содержимое буфера: " + strBuf);
        System.out.println("Текущая длина объекта: " + strBuf.length());
        System.out.println("Объем выделенной памяти: " + strBuf.capacity());
    }
}
