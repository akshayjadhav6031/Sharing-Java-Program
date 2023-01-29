package com.practice1;

public class JavaPractice {
    int a = 4;
    public void m1(JavaPractice n){
        a = a+4;
    }

    public static void main(String[] args) {
        JavaPractice n = new JavaPractice();
        System.out.println(n.a);
        n.m1(n);
        System.out.println(n.a);
    }
}
