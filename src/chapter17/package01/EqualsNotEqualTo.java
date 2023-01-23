package chapter17.package01;

// Пример демонстрирует Метод equals() в сравнении с операцией ==
class EqualsNotEqualTo {
    public static void main(String[] args) {
        String s1 = "Строка";
        String s2 = new String(s1);

        System.out.println(s1 + " равно " + s2 + " : " + s1.equals(s2));
        System.out.println(s1 + " == " + s2 + " : " + (s1 == s2));
    }
}
