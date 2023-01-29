package finalkeywordinjava;
public class C {
    final int x;                                //final keyword
    C(){                                        //final constructor
        x = 10;
    }
    public final void m1(){                     //final method
      // final int  x = 10;
        System.out.println(x);
    }
    public final  void m1(int z){
        System.out.println(z);
    }

    public static void main(String[] args) {
        C c = new C();
        c.m1();
        c.m1(2);
    }
}


