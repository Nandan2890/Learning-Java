package com.practice.linkedList;
import java.util.LinkedList;
import java.util.Iterator;

public class Practice4 {
  public static void main(String[] args){
      
      //Reverse a list of elements
      LinkedList<String> ll = new LinkedList<>();
      ll.add("Ravi");
      ll.add("Vijay");
      ll.add("Ajay");
      
      //traversing the list of elements ini reverse order
      Iterator itr = ll.descendingIterator();
      while(itr.hasNext()){
          System.out.println(itr.next());
      }
  }  
}
