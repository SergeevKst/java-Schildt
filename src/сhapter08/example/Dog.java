package сhapter08.example;

public class Dog extends Animal {

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeSound() {
        System.out.println("wof");
    }

    @Override
    public void eat() {
        System.out.println(super.getFood());
    }
}
