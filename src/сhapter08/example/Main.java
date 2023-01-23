package сhapter08.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal dog=new Dog("Meat","House");
        Animal cat=new Cat("Fish","Street");
        Animal horse= new Horse("Weed","Field");

        Vet vet =new Vet();

        Animal[] clinic={dog,cat,horse};

        Arrays.stream(clinic)
                .forEach(vet::treatAnimal);
    }
}
