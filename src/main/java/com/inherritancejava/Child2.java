package com.inherritancejava;

public class Child2 extends ParentsClass {
    String s = "INDIA";
    boolean h  = true;
    int p = 66;
        public static void main(String[] args) {
            Child2 o = new Child2();
            o.Multiply();
            o.subtraction();
            o.addition();
            System.out.println(o.p);
            System.out.println(o.s);
            System.out.println(o.h);
    }
}
