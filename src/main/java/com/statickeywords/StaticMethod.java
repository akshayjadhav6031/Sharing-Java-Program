 package com.statickeywords;

public class StaticMethod {
    static int q = 19;
    public static void method1(){
        int l = 9;
        float m = 8.8f;
        System.out.println(l);
        System.out.println(m);
    }
    public static void method2(){
        double n = 77.77D;
        String o = "static method";
        System.out.println(n+o);
    }
    public static void method3(){
        System.out.println(q);
    }

    public static void main(String[] args) {
        method1();
        method2();
        method3();
        System.out.println(StaticVariable.y);
    }
}
