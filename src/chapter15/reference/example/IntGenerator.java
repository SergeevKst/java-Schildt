package chapter15.reference.example;

public class IntGenerator {
    /*
     Следует помнить что каждый метод имеет в параметрах неявный указатель на объект
     В этом случае IntGenerator this указан не явно поэтому этот метод совместим с абстрактным методом
     Functional Interface
     */
    public int next(){
        return 5;
    }
}
