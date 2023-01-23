package chapter13.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
/*
Use nio
 */
public class WriterRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "writer.txt");
        Files.write(path, List.of("Hello World", "Java"));

        Files.lines(path).forEach(System.out::println);
    }
}
