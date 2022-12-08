package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class JavaArrayList {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("samsung");
            list.add("apple");
            list.add("nokia");
           // list.clear();           //clears element till clear object
            list.add("one plus");
            list.add("redmi");
            list.add("samsung");
            List<String> list2 = new ArrayList<>();
            list2.add("samsung");
            System.out.println(list.stream());
           // System.out.println(list.size());    //returns numbers of elements = 5
          //  list.retainAll(list2 );     //retains the specified collections values
           // list.removeIf(Predicate.isEqual("apple"));    //removes what u predicate
            //list.removeAll(list);     //removes all the elements from collection
           // list.remove("samsung");       //removes the element
            //System.out.println(list.parallelStream());
            //System.out.println(Math.max(44,77));       //it returns maximum value
            //System.out.println(list2.isEmpty());   //false bcoz collection contains elements
            //System.out.println(list.hashCode());  //returns hashcode value
           // System.out.println(list.equals(list2));
           // System.out.println(list.containsAll(list2));  //provides true value
          //  System.out.println(list.contains("apple"));    //provides true value
         //   list.addAll(2, Collections.singleton("thing"));     //adds element at specified location
            for (Object mobilebrands : list) {
                System.out.println(mobilebrands);

            }

    }
}
