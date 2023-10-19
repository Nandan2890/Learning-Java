package com.practice.linkedList;
import java.util.LinkedList;

public class Practice3 {
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        ll.add("Anuj");
        ll.add("Gaurav");
        ll.add("harsh");
        ll.add("Virat");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Amit");
        
        System.out.println("initial list of elements: " + ll);
        
        //removinf specific elements from list
        ll.remove("Vijay");
        System.out.println("After invoking remove(Object) method: " + ll);
        //removing element on the specific position
        ll.remove(0);
        System.out.println("After iinvoking remove(index) method:" + ll);
        
        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Ravi");
        ll2.add("Hanumat");
        //Adding new elements to arrayList
        ll.addAll(ll2);
        System.out.println("Updated list: " + ll);
        
        //removing all the new elements from arrayList
        ll.removeAll(ll2);
        System.out.println("After invoking removeAll() method: " + ll);
        
        //removing first element from the list
        ll.removeFirst();
        System.out.println("After invoking removeFirst() method: " + ll);
        
        //removing last element from the list
        ll.removeLast();
        System.out.println("After invoking removLast() method: " + ll);
        
        //remove first occurence of element from the list
//        ll.removeFirstOccurrence("Gaurav");
//        System.out.println("After invoking removeFirstOccurence() from the list: " + ll);

        //remove last occurence of element from the list
        ll.removeLastOccurrence("Gaurav");
        System.out.println("After invoking removeLastOccurence(object) from the list : " + ll);
        
        //removing all the elements present in the list
        ll.clear();
        System.out.println("After invoking clear() method: " + ll);
        
    }
}
