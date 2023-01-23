package chapter07.anonymous.inner.simply;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mark");

        Cat cat2 = new Cat("cat-dog") {
            @Override
            public String getSound() {
                return "whof";
            }
        };

        System.out.println(cat1);
        System.out.println(cat1.getSound());

        System.out.println(cat2);
        System.out.println(cat2.getSound());
    }
}
