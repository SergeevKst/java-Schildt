package chapter15.reference.generator;

public class Main {
    public static void main(String[] args) {
        SimpleGen sg = new SimpleGen(5);
        Generator generator=sg::getNumber;
        System.out.println(generator.getNext());

        Generator generator1=SimpleGen::getRandom;
        System.out.println(generator1.getNext());
    }
}
