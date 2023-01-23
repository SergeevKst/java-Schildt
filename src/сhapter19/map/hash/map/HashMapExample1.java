package сhapter19.map.hash.map;

import java.util.HashMap;
import java.util.Map;
/*
При достижении определенного коэф загрзки бакета с Java8 перестановка в сбалансированные деревья
скорость в Map O1,
 */
public class HashMapExample1 {
    public static void main(String[] args) {
        Map<StudentMap, Integer> map = new HashMap<>();
        map.put(new StudentMap("KSt", 1), 2);
        map.put(new StudentMap("Mad", 1), 2);
        map.put(new StudentMap("Max", 1), 2);
        map.put(new StudentMap("Robbin", 1), 2);
        map.put(new StudentMap("Bruck", 1), 2);

        for (Map.Entry<StudentMap, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
