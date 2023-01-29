package com.statickeywords;

public class StaticVariable {
    static int z = 3;
    static float y = 4.4f;
    static double x = 55.55;
    static String w = "static variable";
    public static void main(String[] args) {
        StaticVariable u = new  StaticVariable();
        System.out.println(z);
        System.out.println(y*x);
        System.out.println(w);
        System.out.println(z+w);
        System.out.println(x);
        System.out.println(y);
        StaticMethod.method1();
    }
}
