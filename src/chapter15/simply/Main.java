package chapter15.simply;

public class Main {
    public static void main(String[] args) {
        FuncInter funcInter=(n)->n.toUpperCase();
        System.out.println(funcInter.refactor("Konstantin"));
    }
}
