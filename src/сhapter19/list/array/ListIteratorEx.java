package сhapter19.list.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/*
Продемонстрировать ListIterator
 */
public class ListIteratorEx {
    public static void main(String[] args) {
        String str = "madam";
        List<String> characters = new LinkedList<>(
                Arrays.asList(str.split("")));

        ListIterator<String> listIterator = characters.listIterator();
        ListIterator<String> listIteratorReverse = characters.listIterator(characters.size());

        boolean isPalindrome = true;

        while (listIterator.hasNext() && listIteratorReverse.hasPrevious()) {
            if (!listIterator.next().equals(listIteratorReverse.previous())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it palindrome-" + isPalindrome);
    }
}

