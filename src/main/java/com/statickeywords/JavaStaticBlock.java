package com.statickeywords;

public class JavaStaticBlock {
    static{
        int a = 1;
        float b = 2.2f;
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(StaticVariable.y);
    }
}
