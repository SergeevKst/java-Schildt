package сhapter19.list.array;

import java.util.ArrayList;
import java.util.List;
public class ArrayListEx1 {
    public static void main(String[] args) {
        List<String> lists=new ArrayList<>();

        lists.add("Kst");
        lists.add("learn");
        lists.add("Java");
        lists.add("Collection");

        lists.forEach(System.out::println);

        List<String> lists1=new ArrayList<>(100);

        lists1.add("Kst");
        lists1.add("learn");
        lists1.add("Java");
        lists1.add("Collection");

        lists1.forEach(System.out::println);

        List<String> lists2=new ArrayList<>(lists);
        lists2.forEach(System.out::println);

    }
}
