package chapter14.constructor;
//Использовать обобщенный конструктор
class GenCons {
    private double val;

    <T extends Number> GenCons(T val) {
        this.val = val.doubleValue();
    }

    void showVal() {
        System.out.println("val: " + this.val);
    }
}
/*
В конструкторе GenCons() задается параметр обобщенного типа,
который может быть производным от класса Number, поэтому конструктор GenCons()
 можно вызывать с любым числовым типом, включая Integer, Float или Double.
*/
class GenConsDemo {
    public static void main(String[] args) {
        GenCons iOb = new GenCons(10);
        GenCons dOb = new GenCons(10.2);
        GenCons fOb = new GenCons(12.3F);

        iOb.showVal();
        dOb.showVal();
        fOb.showVal();
    }
}
