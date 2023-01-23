package сhapter08.example;

public class Horse extends Animal{

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeSound() {
        System.out.println("Igo go");
    }

    @Override
    public void eat() {
        System.out.println(super.getFood());
    }
}
