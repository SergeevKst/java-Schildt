package сhapter08.example;

public class Cat extends Animal {
    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeSound() {
        System.out.println("Miy");
    }

    @Override
    public void eat() {
        System.out.println(super.getFood());
    }
}
