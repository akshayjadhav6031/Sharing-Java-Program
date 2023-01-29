package com.javaexceptionhandling;

public class Throws2 {
    public static void Trades(int greentrades) throws Exception {
        if(greentrades>5){
            System.out.println("profitable");
        }else {
            throw new Exception("not profitable");
        }
    }

    public static void main(String[] args) throws Exception {
        Trades(3);
    }
}
