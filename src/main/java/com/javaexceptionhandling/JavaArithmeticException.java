package com.javaexceptionhandling;

public class JavaArithmeticException {
    public static void main(String[] args) {
        int x = 67;
        int y = 87;
        System.out.println(x-y);
        try{
            int z = 67/0;
            int z1 = 87;
            System.out.println(z+z1);
        }catch (ArithmeticException b){
            System.out.println(b);
           // b.printStackTrace();
        }
        System.out.println(x+y);
        System.out.println(y);
    }
}
