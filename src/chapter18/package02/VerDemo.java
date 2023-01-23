package chapter18.package02;

// Продемонстрировать применение класса Runtime.Version

class VerDemo {
    public static void main(String[] args) {
        Runtime.Version ver = Runtime.version();
        System.out.println("Версия: " + ver.version());
        System.out.println("Ocнoвнoй номер версии: " + ver.major());
        System.out.println("Дoпoлнитeльный номер версии: " + ver.minor());
        System.out.println("Hoмep версии системы защиты: " + ver.security());

    }
}
