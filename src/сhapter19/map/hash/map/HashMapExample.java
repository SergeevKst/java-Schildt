package сhapter19.map.hash.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Konstantin");
        map.put(1, "Maria");
        map.put(20, "Andre");
        map.put(30, "Toma");
        map.put(40, "Konstantin");
        map.put(null, "Maria");
        map.put(70, null);
        map.putIfAbsent(30, "Toma");

        System.out.println(map);

        map.remove(40);

        System.out.println(map.containsValue("Maria"));
        System.out.println(map.containsKey(100));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.get(20));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
