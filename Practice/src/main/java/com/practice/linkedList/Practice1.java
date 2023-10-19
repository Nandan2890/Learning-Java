package com.practice.linkedList;
import java.util.LinkedList;
import java.util.Iterator;

public class Practice1 {
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Nandan");
        ll.add("Kaushal");
        ll.add("Rajani");
        ll.add("Kumari");
        
        Iterator<String> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
