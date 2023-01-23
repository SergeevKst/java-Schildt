package chapter15.reference.constructor.list;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Generator generator= ArrayList::new;
        Object newObject = generator.createNewObject();
        System.out.println(newObject.getClass());
    }
}
