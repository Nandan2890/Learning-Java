package com.practice.udemy;

public class Main {
    public static void main(String[] args){
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
//        ll.append(6);
        
//        ll.getLength();
//        
//        ll.printList();
        
//        System.out.println("invoked removeLast() method : " + ll.removeLast().value);
//        System.out.println("after invoked removeFirst() method: " + ll.removeFirst().value);
//        
//        System.out.println("after invoking get(int index) method: " + ll.get(2).value);
//        System.out.println("after invoking the set(int indxx, int value) methof : " + ll.set(2, 7));
//        ll.printList();
//        System.out.println("After invoking insert(int index, int value) method: " + ll.insert(2, 3));
//        System.out.println("After invoking remove(int index) method : " + ll.remove(8));
//        ll.prepend(7);
//        ll.getHead();
//        ll.getTail();
//        ll.reverse();

        System.out.println("after invoking middleElement() method: " + ll.middleElement().value);
        
        ll.printList();
    }
}
