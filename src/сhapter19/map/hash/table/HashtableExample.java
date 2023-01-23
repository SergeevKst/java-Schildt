package сhapter19.map.hash.table;

import java.util.Hashtable;
/*
null нельзя хранить
 */
public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String>hashtable=new Hashtable<>();
        hashtable.put(1, "Kst");
        hashtable.put(2, "Maria");
        hashtable.put(70, "Logan");
        hashtable.put(4, "Mark");
        hashtable.put(500, "Nil");
        hashtable.put(25, "White");
        System.out.println(hashtable);
    }
}
