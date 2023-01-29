package com.collections;

import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
            LinkedList<Integer>list1 = new LinkedList<>();
            list1.add(11);
            list1.add(22);
        list1.addFirst(33);
            for (Object age : list1){
                System.out.println(age);
            }
            LinkedList<Integer>list2 = new LinkedList<>();
            list2.add(11);
            list2.add(22);
            for (Object age2 : list2){
                System.out.println(age2);
            }
            System.out.println(list1.equals(list2));
            System.out.println(list1.size());
            System.out.println(list1.contains(11));
            System.out.println(list1.containsAll(list2));
            System.out.println(list1.removeFirst());
            System.out.println(list1.isEmpty());

        }
    }

