package com.practice.linkedList;
import java.util.LinkedList;

public class Practice2 {
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<>();
        System.out.println("Initial list of elements: " + ll);
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        System.out.println("After invoking add(E e) method:" + ll);
        
        //Adding an element to the specific position
        ll.add(1, "Gaurav");
        System.out.println("After invoing add(int index, E element) method: " + ll);
        
        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Sonoo");
        ll2.add("Hanumat");
        
        //Adding second list elements to the first list
        ll.addAll(ll2);
        System.out.println("after invoking addAll(Collection<? extends E>c) method: "+ ll);
        
        LinkedList<String> ll3 = new LinkedList<>();
        ll3.add("John");
        ll3.add("RAhul");
        ll3.add("RAju");
        
        //adding second list elements to the first line at specific position
        ll.addAll(1,ll3);
        System.out.println("after invoking addAll(int index,collection<?extends E> c) method: " + ll);
        
        //adding an element at the first position
        ll.addFirst("Lokesh");
        System.out.println("Afetr invoking addFirst(E e) method: " + ll);
        
        //adding an element at the last position
        ll.addLast("Harsh");
        System.out.println("After invoking addLast(E e) method: " + ll);
    }
}
