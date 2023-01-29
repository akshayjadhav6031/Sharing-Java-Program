package com.practice1;

import java.awt.*;
import java.util.LinkedList;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Collectionsexample {
    public static void main(String[] args) {
        SortedSet list1 = new TreeSet();
        SortedSet list2 = new TreeSet();
      //  list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(4);
        //list1.add(null);
      //  list1.add(null);
        list1.add(1);
        list1.add(5);
        list2.add("akshay");
        list2.add("zukerberg");
        list2.add("long");
        for (Object letters : list1){
            System.out.println(letters);
        }
        for (Object names : list2){
            System.out.println(names);
        }
    }
}