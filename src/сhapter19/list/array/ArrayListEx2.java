package сhapter19.list.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Kst");
        list.add("learn");
        list.add("Java");

        list.add(2,"Collection");

        System.out.println("Element "+list.get(2));

        list.set(0,"Konstantin");
        list.remove("Java");

        System.out.println(list.isEmpty());
        System.out.println(list.indexOf("Java"));
        System.out.println(list.indexOf("learn"));
        System.out.println(list.contains("Java"));

        list.forEach(System.out::println);

        List<String> lists1 = new ArrayList<>(list);

        lists1.addAll(3,list);

        lists1.clear();
        System.out.println(lists1.size());


    }
}
