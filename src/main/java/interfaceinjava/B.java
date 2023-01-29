package interfaceinjava;

public class B extends A {
    int x;
    int y;
//    B(){
//        super();
    B(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println(x+y);
    }

    public static void main(String[] args) {
//        B b1=new B();
        B b = new B(3,4);

    }
}




