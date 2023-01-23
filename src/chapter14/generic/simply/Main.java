package chapter14.generic.simply;

/*
Продемонстрировать как было до Java5
Так же благодаря стиранию JVM стирает generic и приводит к виду как до Java5
Благодаря этому возможно взаимодействие старого и нового кода
 */
public class Main {
    public static void main(String[] args) {

        Generic<Integer> generic = new Generic<>();
        generic.setObject(22);
        int example = generic.getObject();
        System.out.println(example);

        Generic.BeforeGeneric beforeGeneric = generic.new BeforeGeneric();
        beforeGeneric.setObject("Before java 5");
        String before = (String) beforeGeneric.getObject();
        System.out.println(before);

    }
}
