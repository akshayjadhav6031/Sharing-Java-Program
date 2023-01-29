package oop.polymorphism;

public class MethodOverloading {
    String s = "by changing data type";
    void addition(int a,int b) {
        System.out.println(a+b);
    }
    public void addition(int a,float b){
        System.out.println(a+b);
    }
    public void addition(int a,float b,int c,double d){
        System.out.println(a+b+c+d);
    }
    public static void m1(){

    }
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.addition(1,2);
        m.addition(1,2.2f);
        m.addition(1,2,3,4);
        System.out.println(m.s);

          }

    public static void main(String args) {
        MethodOverloading m = new MethodOverloading();
        m.addition(1,2);
        m.addition(1,2);
        m.addition(1,2,3,4);

    }

    public static void main() {

    }
}
