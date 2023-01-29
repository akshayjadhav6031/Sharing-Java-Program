package com.typesofvariable;

public class InstanceVariable {
    int i = 1;
    float j = 1.1f;
    char k = 'l';
    String m = "hdfc";
    double n = 22.22;
    public static void main(String[] args) {
               InstanceVariable p = new InstanceVariable();
        System.out.println(p.i-p.j*p.k+p.n+p.m);
     //   System.out.println(StaticVariable.z);


    }
}
