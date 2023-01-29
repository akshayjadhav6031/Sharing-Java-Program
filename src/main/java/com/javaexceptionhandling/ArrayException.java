package com.javaexceptionhandling;

public class ArrayException {
    public static void main(String[] args) {
        System.out.println("g");
        try {
            int[] x= {1,2,3,4};
            System.out.println(x[7]);
        }catch (ArrayIndexOutOfBoundsException h){
            //v.printStackTrace();
            System.out.println(h);
            System.out.println("Exception");
        }
      }
    }
