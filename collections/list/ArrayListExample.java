package com.gv.collections.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> intArrayList = new ArrayList<>(); // Use List interface and ArrayList implementation
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);
        intArrayList.add(5);
        System.out.println(intArrayList);
        
        List<String> stringList = new ArrayList<>();
        
        stringList.add("ABC");
        stringList.add("BBC");
        stringList.add("CBC");
        stringList.add("BAC");
        stringList.add("BCA");
        
        System.out.println(stringList.toString());
        
        // Using for loop
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }
        
        // Using enhanced for loop (advanced for loop)
        for (int number : intArrayList) {
            System.out.println(number);
        }
        
        // Using forEach method with lambda expression
        stringList.forEach(e -> System.out.println(e));
        
        // Using stream API with forEach method reference
        stringList.stream().forEach(System.out::println);
        
        // Using stream API with map and forEach to print binary representation of integers
        intArrayList.stream().map(Integer::toBinaryString).forEach(System.out::println);
        
        // Iterator usage to print binary representation of integers
        Iterator<Integer> intIterator = intArrayList.iterator();
        while (intIterator.hasNext()) {
            int number = intIterator.next();
            System.out.println(Integer.toBinaryString(number));
        }
    }
}
