package сhapter19.list.array;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx3 {
    public static void main(String[] args) {
        StringBuilder[] sb = new StringBuilder[]{
                new StringBuilder("A"),
                new StringBuilder("B"),
                new StringBuilder("C")};

        List<StringBuilder> lists = Arrays.asList(sb);

        sb[0] = new StringBuilder("Java");
        lists.forEach(System.out::println);

        StringBuilder[] sb1 = new StringBuilder[]{
                new StringBuilder("Java"),
                new StringBuilder("B"),
                new StringBuilder("C")};

        List<StringBuilder> lists1 = Arrays.asList(sb1);

        System.out.println(lists.removeAll(lists1));
        System.out.println(lists.containsAll(lists1));

        StringBuilder[] strings = lists.toArray(StringBuilder[]::new);
        Arrays.stream(strings).forEach(System.out::println);
    }
}
