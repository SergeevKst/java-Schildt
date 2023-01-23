package chapter13.myexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "text.txt").toFile();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String collect = reader
                    .lines()
                    .collect(Collectors.joining("*"));
            System.out.println(collect);
        }


    }
}
