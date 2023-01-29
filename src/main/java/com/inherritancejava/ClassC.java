package com.inherritancejava;

public class ClassC extends Child1 {
    int a = 5;
    public static void main(String[] args) {
        ClassC c = new ClassC();                 //example for multilevel(class A-class B-class C)
        c.addition();                             //(class A = parent class)-(class B=child 1)-(class C =class C)
        c.Multiply();
        c.subtraction();
        System.out.println(c.a);

    }
}
