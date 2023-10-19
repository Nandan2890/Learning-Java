package com.practice.arrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Practice4 {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        
        al.add("banana");
        al.add("cherry");
        al.add("guava");
        al.add("Apple");
        al.add("Strawberry");
        
        Collections.sort(al);
        
        for(String fruits: al){
            System.out.println(fruits);
        }
        
        //Sorting numbers
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(10);
        al2.add(8);
        al2.add(3);
        al2.add(30);
        al2.add(22);
        System.out.println("Array before Sorting: " + al2);
        
        Collections.sort(al2);
        System.out.println("Array after sorting: " + al2);
    }
}
