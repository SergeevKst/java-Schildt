package chapter17.package01;

// Создать один объект типа String из другого
class MakeString {
    public static void main(String[] args) {
        char[] chars = {'J','a','v','a'};
        String s = new String(chars);
        String c = new String(s);
        System.out.println(s);
        System.out.println(c);
    }
}
