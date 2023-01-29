package interfaceinjava;

public interface InterfaceChild extends InterfaceParent {
    String s = "interface";
    void m1();

    void m2();
    void m3();
    void m4();

    public static void main(String[] args) {
        System.out.println(s);
    }
}
