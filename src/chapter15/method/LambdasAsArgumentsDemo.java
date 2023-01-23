package chapter15.method;
//Передать лямбда-выражение в качестве аргумента вызываемому методу
interface StringFunc {
    String getFunc(String n);
}

class LambdasAsArgumentsDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.getFunc(s);
    }

    public static void main(String[] args) {
        String inStr = ("Строка С Пробелами");
        String outStr;
        System.out.println("Это исходная строка: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Строка прописными буквами: " + outStr);

        outStr = stringOp((str) -> {
          String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            } return result;
        }, inStr);
        System.out.println("Cтрока с удаленными пробелами: " + outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        // Теперь ссылку reverse можно передать в качестве первого параметра
        // методУ stringOp(), поскольку она делается на объект типа StringFunc
        System.out.println("Этo обращенная строка: " + stringOp(reverse, inStr));
    }
}
/* --------------------------------------------
Это исходная строка: Строка С Пробелами
Строка прописными буквами: СТРОКА С ПРОБЕЛАМИ
Cтрока с удаленными пробелами: СтрокаСПробелами
Этo обращенная строка: ималеборП С акортС
 */