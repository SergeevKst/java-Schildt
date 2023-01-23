package chapter17.package02;

// Изменить порядок следования символов в объекте
// типа StringBuffer с помощью метода reverse()

class ReverseDemo {
    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer("Сторка!");
        System.out.println("Исходная: " + strBuf);
        strBuf.reverse();
        System.out.println("Перевернутая: " + strBuf);
    }
}
