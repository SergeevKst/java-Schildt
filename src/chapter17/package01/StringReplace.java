package chapter17.package01;

// Замена подстроки

class StringReplace {
    public static void main(String[] args) {
        String str = "This is а test. This is, too.";
        String search = "is";
        String sub = "was";
        String result = "";
        int i;
        do { // заменить все совпадающие подстроки
            System.out.println(str);
            i = str.indexOf(search);
            if (i != -1) {
                result = str.substring(0, i);
                result = result + sub;
                result = result + str.substring(i + search.length());
                str = result;
            }
        } while (i != -1);
    }
}
