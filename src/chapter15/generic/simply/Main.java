package chapter15.generic.simply;

import chapter15.generic.override.Mod;

public class Main {
    public static void main(String[] args) {
        Mod mod = new Mod();
        Modification<Integer> i = mod::add;
        Modification<Double> d = mod::add;
        Modification<String> s = mod::add;
    }
}
