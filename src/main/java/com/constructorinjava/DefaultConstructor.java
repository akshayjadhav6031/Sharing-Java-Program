package com.constructorinjava;

public class DefaultConstructor {
      float f = 4.4f;
      float j = 2.2f;
    DefaultConstructor(){
        System.out.println(f*j);
        System.out.println(f);
    }

    public static void main(String[] args) {
        DefaultConstructor z = new DefaultConstructor();
        System.out.println(z.f);

    }
}