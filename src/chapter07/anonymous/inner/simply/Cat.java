package chapter07.anonymous.inner.simply;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getSound() {
        return "miy";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
