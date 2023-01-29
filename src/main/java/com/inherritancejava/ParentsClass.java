package com.inherritancejava;

public class ParentsClass {
    int z=45;
    int x=15;
    public void addition(){
        System.out.println(z+x);
    }
    public void subtraction()
    {
        System.out.println(z-x);
    }
    public void Multiply(){
        System.out.println(z*x);
    }

    public static void main(String[] args) {
ParentsClass n=new ParentsClass();
n.addition();
n.subtraction();
n.Multiply();
    }
}
