package interfaceinjava;

public interface InterfaceParent {
    int x = 1;
    int y = 11;

    void m1();

    void m2();
    default void  m3(){
        System.out.println(x+y);
        m5();
            }
     static void m4(){
         System.out.println(x-y);
     }
     private void m5(){
         System.out.println("hiiiii");
     }
    static void main(String[] args) {
        m4();


    }
}
