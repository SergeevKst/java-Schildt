package chapter17.package01;

// Продемонстрировать применение разных форм методов indexOf() и lastIndexOf()
class IndexOfDemo {
    public static void main(String[] args) {
        String str = "Now is the time for all good men to come to the aid of their country.";
        System.out.println("Исходная строка: " + str);

        System.out.println("Метод indexOf(t): " + str.indexOf('t'));
        System.out.println("Метод lastIndexOf(t): " + str.lastIndexOf('t'));
        System.out.println("Метод indexOf(the): " + str.indexOf("the"));
        System.out.println("Метод lastIndexOf(the): " + str.lastIndexOf("the"));
        System.out.println("Метод indexOf(t, 10): " + str.indexOf('t', 10));
        System.out.println("Метод lastIndexOf(t, 60): " + str.lastIndexOf('t', 60));
        System.out.println("Метод indexOf(the, 10): " + str.indexOf("the", 10));
        System.out.println("Метод lastIndexOf(the, 60): " + str.lastIndexOf("the", 60));

    }
}
