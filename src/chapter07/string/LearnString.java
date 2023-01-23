package chapter07.string;

public class LearnString {
    public static void isPolindrom(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);

        System.out.println(stringBuilder
                .reverse()
                .toString()
                .equalsIgnoreCase(word));
    }
}
