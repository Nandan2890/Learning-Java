package com.practice.udemy;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail= newNode;
        length++;
    }
    
    public void getHead(){
        if(length == 0){
            System.out.println("there is no element");
        }
        System.out.println("head : " + head.value);
    }
    public void getTail(){
        if(length==0){
            System.out.println("there is no element");
        }
        System.out.println("tail : " + tail.value);
    }
    public void printList(){
        if(length == 0){
            System.out.println("null");
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getLength(){
        if(length == 0){
            System.out.println("0");
        }
        
        System.out.println("Length: " + length);
    }
    
    //Append: add the new element at last of the list
    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    
    //removeLast: remove the last element of the list
    public Node removeLast(){
        if(length == 0){
            return null;
        }
        
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        
        length--;
        
        return temp;
    }
    
    //prepend: adding the new Node at first
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    
    //removeFirst(): remove the first element of the list
    public Node removeFirst(){
        if(length == 0){
            return null;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
        
        length--;
        
        if(length == 0){
            tail=null;
        }
        return temp;
    }
    
    //get(int index): get the element at the specific index
    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        
        return temp;
    }
    
    //set(int indx, int value): set the value at the specific index
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
    
    //insert(int index, int value): insert the new node at the specific index
    public boolean insert(int index, int value){
        if(index < 0 || index > length){
            return false;
        }
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        
        length++; 
        
        return true;
    }
    
    //remove(int index): remove the node at the spcific index
    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == length-1){
            return removeLast();
        }
        Node prev = get(index-1);
        Node temp = prev.next;
        
        prev.next = temp.next;
        temp.next = null;
        
        length--;
        return temp;
    }
    
    public void reverse(){
       Node temp = head;
       head = tail;
       tail = temp;
       
       Node after = temp.next;
       Node before = null;
       
       for(int i = 0; i < length; i++){
           after = temp.next;
           temp.next = before;
           before = temp;
           temp = after;
       }
    }
    
    //middleNode(): method to find the middle node of the list by using hare and tortoise
    //method are also called Floyd's tortoise and hare problem
    
    public Node middleElement(){
        Node fast_ptr = head;
        Node slow_ptr = head;
        
        while(fast_ptr != null && fast_ptr.next != null){
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        return slow_ptr;
    }
}
