package chapter13.simply;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        System.out.println("Bвeдитe строки текста через <Enter>.");
        System.out.println("Bвeдитe 'стоп' для завершения:");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("стоп"));
    }
}