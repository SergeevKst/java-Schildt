package chapter17.package01;

class ChangeCase {
    public static void main(String[] args) {
        String str = "Исходная строка";

        String upper = str.toUpperCase();
        String lower = str.toLowerCase();

        System.out.println(str + "-> преобразуем в Bерхний регистр: " + upper);
        System.out.println(str + "-> преобразуем в Нижний регистр: " + lower);
    }
}
