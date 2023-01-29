package com.upcasting;

public class Child extends Parent{
    int a = 888;

    public void m1(){
        System.out.println("child class method");
    }

    public static void main(String[] args) {
        Parent P1 = new Child();            //For Upcasting
        Parent P2 = new Parent();
        P1.m1();
        P2.m1();
        System.out.println(P1.a);
        System.out.println(P2.a);
    }
   }
