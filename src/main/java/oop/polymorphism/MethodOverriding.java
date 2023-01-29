package oop.polymorphism;

public class MethodOverriding {              //parent class
    public void mathEquation(int x,int y)
    {
        System.out.println(x+y);
    }
    public void mathEquation(int a,float b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        MethodOverriding r = new MethodOverriding();
        r.mathEquation(9,8);
        r.mathEquation(7,6.6f);
    }
}
