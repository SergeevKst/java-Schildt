package chapter07.anonymous.inner.duo;

import java.util.Comparator;

/*
Демонстрация возможности создания нескольких разных
объектов анонимного класса
с помощью Reflection API
 */
public class Duo {
    public static void start() {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Comparator<String> comparator1;
        try {
            comparator1 = comparator.getClass().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(comparator == comparator1);
    }
}
