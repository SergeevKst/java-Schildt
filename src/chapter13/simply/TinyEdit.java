package chapter13.simply;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[100];

        System.out.println("Bвeдитe строки текста через <Enter>.");
        System.out.println("Bвeдитe 'стоп' для завершения:");

        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("стоп")) break;
        }

        System.out.println("\nCoдepжимoe вашего файла:");

        for (int i = 0; i < 100; i++) {
            if (str[i].equals("стоп")) break;
            System.out.println(str[i]);
        }
    }
}
