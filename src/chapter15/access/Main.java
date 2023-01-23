package chapter15.access;

public class Main {
    public static void main(String[] args) {
        Check check=new Check(new int[]{1,2,3,4,5});
        Sum sum=check.getSum();
        System.out.println(sum.getSum());

        System.out.println(Check.getStaticSum().getSum());
    }


}
