package oop.polymorphism;

public class MethodOverridingChild extends MethodOverriding{
    public void mathEquation(int x, int y) {
        System.out.println(x-y);
    }

    @Override
    public void mathEquation(int a, float b) {
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        MethodOverridingChild v = new MethodOverridingChild();
        v.mathEquation(1,2);
        v.mathEquation(1,3.3f);
    }
}
//    public void mathEquation(int x,int y)
//    {
//        System.out.println(x-y);
//    }
//    public void mathEquation(int a,float b){
//        System.out.println(a/b);
//    }
//
//    public static void main(String[] args) {
//        MethodOverridingChild l = new MethodOverridingChild ();
//        l.mathEquation(9,8);
//        l.mathEquation(7,6.6f);
//    }