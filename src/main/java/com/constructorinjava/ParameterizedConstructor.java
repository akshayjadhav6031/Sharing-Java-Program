package com.constructorinjava;

public class ParameterizedConstructor {
    int a;
    float f;
          public ParameterizedConstructor(int b,float g) {
            this.a=b;
            this.f=g;

       }
             public static void main(String[] args) {
            ParameterizedConstructor ParameterizedConstructor = new ParameterizedConstructor(11,22.22f);
                 ParameterizedConstructor c1 = new ParameterizedConstructor(13,33.33f);
                              System.out.println(ParameterizedConstructor.a+" "+ParameterizedConstructor.f);
                 System.out.println(c1.a+" "+c1.f);

    }
}