package chapter15.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Saver saver = (obj) -> {
            Path path = Path.of("resources", "writer.txt");
            Files.write(path, List.of(obj.toString()));
        };
        try {
            saver.save("Learn Java");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
