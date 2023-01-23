package сhapter12.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Demo demo = new Demo();

        try {
            main.print(demo, demo.getClass());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    private void print(Object o, Class cl) throws IllegalAccessException {
        Field[] declaredFields = cl.getDeclaredFields();

        for (Field field : declaredFields) {
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();

            for (Annotation annotation : declaredAnnotations) {
                if (annotation.annotationType().equals(Show.class)) {
                    System.out.println(field.get(o));
                }
            }
        }
    }
}
