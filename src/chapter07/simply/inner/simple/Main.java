package chapter07.simply.inner.simple;

public class Main {
    public static void main(String[] args) {
        Letter letter = new Letter("Konstantin");
        Letter.Address address=letter.new Address(101);
        System.out.println(address.getSender());
        System.out.println(address);
    }
}
