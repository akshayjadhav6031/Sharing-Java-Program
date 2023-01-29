package com.javaexceptionhandling;

public class JavaFinally {
    public static void main(String[] args) {
        System.out.println("Finally Block");
        try {
          //  System.exit(1);                                        //finally block with system exit
            int a = 6/0;
            int b = 5;
            System.out.println(a+b);
        }catch (ArithmeticException k){
            System.out.println("Java Finally Block");
            System.out.println(k);
            k.printStackTrace();
        }
        finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("rest of the code");
    }
    }
