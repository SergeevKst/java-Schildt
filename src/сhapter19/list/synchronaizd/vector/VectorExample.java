package сhapter19.list.synchronaizd.vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Maksim");
        vector.add("Kst");
        vector.add("Levi");
        vector.add("Andrew");
        vector.add("Toma");

        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.get(1));
    }
}
