package chapter15.generic.override;

public class Mod {

    public Integer add(Integer a){
        return a+10;
    }
    public Double add(Double a){
        return a+10.0;
    }
    public String add(String a){
        return a+" "+a;
    }

}
