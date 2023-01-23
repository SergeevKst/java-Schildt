package сhapter08.example;

public class Animal {

    private final String food;
    private final String location;

    public void makeSound(){
        System.out.println("Animal sound");
    }

    public void eat(){
        System.out.println("Animal eat "+food);
    }

    public void sleep(){
        System.out.println("Zzz");
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
