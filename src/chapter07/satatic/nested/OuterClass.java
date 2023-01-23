package chapter07.satatic.nested;

public class OuterClass {
    private String text;
    private static int number = 10;

    public OuterClass(String text) {
        super();
        this.text = text;
    }

    public static class NestedClass {
        private String word;

        public NestedClass(String word) {
            this.word = word;
        }

        public void show() {
            System.out.println(word + " " + number);
        }

        public void show(OuterClass outerClass) {
            System.out.println(word + " " + number + " " + outerClass.text);
        }
    }
}
