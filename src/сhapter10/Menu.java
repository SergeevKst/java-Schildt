package сhapter10;

import сhapter10.exception.UncorrectedAgeException;
import сhapter10.model.Engine;
import сhapter10.model.User;

public class Menu {
    public static void start() {

        User user = new User();

        try {
            user.setAge();
        } catch (UncorrectedAgeException e) {
            System.err.println(e.getMessage());
        } finally {
            user.screen("Try again");
        }

        Engine engine = new Engine();

        engine.setVolume();
    }
}
