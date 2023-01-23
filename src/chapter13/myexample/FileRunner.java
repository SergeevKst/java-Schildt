package chapter13.myexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
/*
We can use to try with resources
 */
/**
 * output stream
 * application ------> file
 * <p>
 * input stream
 * file ------> application
 */
public class FileRunner {
    public static void main(String[] args) {

        File file = Path.of("resources", "text.txt").toFile();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[fileInputStream.available()];
            int count = 0;
            byte currentByte;

            while ((currentByte = (byte) fileInputStream.read()) != -1) {
                bytes[count++] = currentByte;
            }

            String text = new String(bytes);
            System.out.println(text);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

