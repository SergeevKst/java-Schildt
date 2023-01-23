package chapter15.reference.example;
/*
Продемонстрировать пример: если в метод функционального интерфейса передать объект класса
то можно вызвать схожий по сигнатуре метод не создавая объект класса
и не использовать static
 */
public class Main {
    public static void main(String[] args) {
        Generator generator=IntGenerator::next;
        System.out.println(generator.generator(new IntGenerator()));
    }
}
