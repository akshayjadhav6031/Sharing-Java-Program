package com.upcasting;

public class Parent {
    int a = 777;
    void m1(){
        System.out.println("parent class method");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.m1();
        System.out.println(p.a);

    }
}
