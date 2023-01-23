package сhapter19.list.synchronaizd.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String>strings=new Stack<>();
        strings.push("KST");
        strings.push("Konstantin");
        strings.push("Alex");
        strings.push("Toma");
        strings.push("Tanaka");

        System.out.println(strings);
        System.out.println(strings.pop());
        System.out.println(strings);

        System.out.println(strings.peek());
    }


}
