package interfaceinjava;

public class InterfaceChild2 implements InterfaceParent,InterfaceChild{

    @Override
    public void m1() {
        System.out.println(x+y);
    }

    @Override
    public void m2() {
        System.out.println(s);

    }

    @Override
    public void m3() {
        System.out.println(x-y);
    }

    @Override
    public void m4() {
        System.out.println(y-x);
    }


    public static void main(String[] args) {
        InterfaceChild2 InterfaceChild2 = new InterfaceChild2();
        InterfaceChild2.m1();
        InterfaceChild2.m2();
        InterfaceChild2.m3();
        InterfaceChild2.m4();
        //InterfaceChild2.m5();

    }
}
