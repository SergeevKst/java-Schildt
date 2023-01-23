package chapter07.simply.inner.function;

public class Main {
    public static void main(String[] args) {
        MathFunction mathFunction=new MathFunction();

        System.out.println(calculate(mathFunction.getSquare(), 1, 5));
        System.out.println(calculate(mathFunction.getCube(), 2, 7));
    }
    private static int calculate(Function func, int begin, int end){
        return func.calculate(begin, end);
    }
}
