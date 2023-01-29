package oop.polymorphism;

public class StaticMethodOverloading {
    String s = "by using static method";
    public static void addition(int a,int b) {
        System.out.println(a+b);
    }
    public static void addition(int a,float b){
        System.out.println(a+b);
    }
    public static void addition(int a,float b,int c,double d){
        System.out.println(a+b+c+d);
    }
    public static void main(String[] args) {
        StaticMethodOverloading m = new StaticMethodOverloading();
        StaticMethodOverloading.addition(1,2);
        StaticMethodOverloading.addition(1,2.2f);
        StaticMethodOverloading.addition(1,2,3,4);
        System.out.println(m.s);

    }
}
