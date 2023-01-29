package com.typesofvariable;

public class StaticVariable {
  //  static int a = 1;
  //  int b = 2;
    static {
        int a = 1;
        int b = 2;
        System.out.println(a+b);
           }


    //    static int z = 10;
//    static float f = 1.1f;
//    static double d = 11.11d;
    public static void main(String[] args) {


        InstanceVariable p = new InstanceVariable();
//      System.out.println(z);
//            System.out.println(f);
//            System.out.println(d);
        System.out.println(p.i);                      // int i = 1;
//
//    }
//}

    }}
