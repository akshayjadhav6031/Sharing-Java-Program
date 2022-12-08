package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        Map<Integer,String>list1 = new HashMap<>();
        list1.put(1,"Akshay");
        list1.put(3,"jadhav");
        list1.put(2,"Bajirao");
        list1.put(4,"Akshay");
        list1.put(6,"akshay");
        list1.put(1,"Rohit");
        for (Map.Entry<Integer,String>e : list1.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println(list1.containsKey(5));
        System.out.println(list1.containsValue("Akshay"));
    }
}
