package chapter13.simply;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bвeдитe символы, 'q' - для выхода.");

        do {
            c = (char) br.read();
            System.out.print(c);
        } while (c != 'q');
    }
}