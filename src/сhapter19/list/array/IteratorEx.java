package сhapter19.list.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Kst");
        list.add("learn");
        list.add("Java");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println(list);
    }
}
