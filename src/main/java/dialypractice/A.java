package dialypractice;

public class A {
        String s = "akshay";
    public void m1(){
        System.out.println(s);
    }
    private void m2(){
        System.out.println("private method");
    }
    public static void m3(){
        System.out.println("static method");
    }
    public static void main(String[] args) {
        A a = new A();
        int two = 2;
        int three = 4;
        System.out.println("Multiplication Of ");
        System.out.println("2"+" "+"&"+" "+"3"+" "+"is");
        System.out.println(two*three);
        a.m1();
        a.m2();
    }
    }
