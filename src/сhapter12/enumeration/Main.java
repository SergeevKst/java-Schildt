package сhapter12.enumeration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setRole(Enumeration.ADMINISTRATOR.getRole());

        User user1 = new User();
        user1.setRole(Enumeration.USER.getRole());

        System.out.println(user);
        System.out.println(user1);

        Arrays.stream(Enumeration.values())
                .forEach(System.out::println);
    }
}
