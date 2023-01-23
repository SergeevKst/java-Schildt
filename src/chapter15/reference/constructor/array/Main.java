package chapter15.reference.constructor.array;

public class Main {
    public static void main(String[] args) {
        Generator generator=int[]::new;
        Object newObject = generator.createNewObject(10);
        System.out.println(newObject.getClass());
    }
}
