package сhapter08.example;

public class Vet {
    public void treatAnimal(Animal animal){
        System.out.println("What animal eat: "+animal.getFood());
        System.out.println("Where animal live: "+animal.getLocation());
        System.out.println("Treat...");

        System.out.print("grateful to Vet: ");
        animal.makeSound();
    }
}
