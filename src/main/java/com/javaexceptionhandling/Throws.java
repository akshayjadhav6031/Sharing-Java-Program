package com.javaexceptionhandling;

public class Throws {
    public static void eligibility(int age) throws Exception{
        if (age>18){
            throw new Exception("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
    public static void main(String[] args)throws Exception {
        //eligibility(19);
        eligibility(17);
    }
}
