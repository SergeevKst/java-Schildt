package сhapter19.map.linked;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> linked = new LinkedHashMap<>(16, 0.75f, false);
        linked.put(1, "Kst");
        linked.put(2, "Maria");
        linked.put(70, "Logan");
        linked.put(4, "Mark");
        linked.put(500, "Nil");
        linked.put(25, "White");

        System.out.println(linked);
        System.out.println(linked.get(70));
        System.out.println(linked.get(4));
        System.out.println(linked.get(25));
        System.out.println(linked);

        LinkedHashMap<Integer, String> linked1 = new LinkedHashMap<>(16, 0.75f, true);
        linked1.put(1, "Kstq");
        linked1.put(2, "Mariaw");
        linked1.put(70, "Loganw");
        linked1.put(4, "Marke");
        linked1.put(500, "Nilr");
        linked1.put(25, "Whiter");

        System.out.println(linked1);
        System.out.println(linked1.get(70));
        System.out.println(linked1.get(4));
        System.out.println(linked1.get(25));
        System.out.println(linked1);
    }
}
