package com.javaexceptionhandling;

public class JavaNullPointerException {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        }catch (NullPointerException v){
             System.out.println(v);
            v.printStackTrace();
        }
        System.out.println("null");
    }
      }

