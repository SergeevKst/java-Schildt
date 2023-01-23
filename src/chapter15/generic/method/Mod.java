package chapter15.generic.method;

/*
Продемонстрировать то что JVM сама разберется какой тип подставить в обобщенный метод
 */
public class Mod {

    public <T> T add(T element) {
        return element;
    }

}
