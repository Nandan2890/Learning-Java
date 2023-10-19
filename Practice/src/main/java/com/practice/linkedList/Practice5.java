package com.practice.linkedList;
import java.util.LinkedList;
import java.util.List;

public class Practice5 {
    public static void main(String[] args){
       //Creating list of books
       List<Book> list = new LinkedList<>();
       
       Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
       Book b2 = new Book(102, "Let us Pyhton", "MC Graw Hill", "tata", 9);
       Book b3 = new Book(103, "Let us Java", "Robin hood", "Oracle", 10);
       
       list.add(b1);
       list.add(b2);
       list.add(b3);
       
       for(Book book : list){
           System.out.println(book.id + " " +
                   book.name+" "+book.author+" "+
                   book.publisher+" "+book.quantity);
       }
    }
}

class Book{
    int id;
    String name, author, publisher;
    int quantity;
    
    public Book(int id, String name, String author,
            String publisher, int quantity){
        this.id= id;
        this.name= name;
        this.author= author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
