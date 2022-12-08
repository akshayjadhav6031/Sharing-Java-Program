package com.collections;

import java.util.Hashtable;
import java.util.Map;

public class JavaHashtable {
    public static void main(String args[]){
        Hashtable<Integer,String>list=new Hashtable<Integer,String>();
        list.put(3,"Amit");
        list.put(1,"Ravi");
        list.put(4,"Vijay");
        list.put(2,"Rahul");
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.contains(3));
        for (Map.Entry<Integer,String> e : list.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
//        for(Object p : list.entrySet()){
//            System.out.println(p);
        }
    }
}
