package com.practice.arrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class Practice2 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("Cherry");
        list.add("grapes");
        list.add("apple");
        
        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
