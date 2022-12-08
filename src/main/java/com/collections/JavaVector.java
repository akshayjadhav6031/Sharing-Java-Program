package com.collections;

import java.util.Vector;

public class JavaVector {
    public static void main(String[] args) {
        Vector<String> list1 = new Vector<>();
        Vector<String> list2 = new Vector<String>();
        list1.add("mango");
        list1.add("grapes");
        list1.add("banana");
        list1.add(2,"apple");
        list1.addElement("orange");
        System.out.println(list1.get(3));
//        Iterator<String> itr = list1.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
        for (Object fruits : list1) {
            System.out.println("Name of fruits :"+ fruits);
        }
        list2.addAll(list1);
        System.out.println("Fruits in list 2 :" + list2);
        }
    }


