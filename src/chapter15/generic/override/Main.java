package chapter15.generic.override;

public class Main {
    public static void main(String[] args) {
        Modification<String> mod = (text) -> text.toUpperCase();
        System.out.println(mod.modification("text"));
    }
}
