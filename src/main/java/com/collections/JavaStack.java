package com.collections;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Stack list = new Stack();
        list.add(1);
        list.add("akshay");
        list.add("akshay");
        list.add("bajirao");
        list.add("jadhav");
        list.add("null");
        list.pop();
        list.push(3);
        list.empty();
        list.peek();
        list.search(8);

       // System.out.println();

        for (Object a : list) {
         //   System.out.println();
            System.out.println(a);
           // System.out.println();
        }
    }
}
