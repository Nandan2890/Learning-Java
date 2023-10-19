package com.practice.arrayList;
import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add("Cherry");
        list.add("grapes");
        list.add("apple");
        list.add("Chickoo");
        
        System.out.println("Returning element:" + list.get(1));
        
        list.set(1, "Dates");
        
        for(String fruits: list){
            System.out.println(fruits);
        }
    }
}
