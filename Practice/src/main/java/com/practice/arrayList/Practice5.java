package com.practice.arrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class Practice5 {
    public static void main(String[] args){
        Student s1 = new Student("Nandan", 101, "Java");
        Student s2 = new Student("Kaushal",102,"Python");
        Student s3 = new Student("Radhika",103, "Python");
        Student s4 = new Student("Raj", 104, "MERN");
        
        ArrayList<Student> student = new ArrayList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        
        Iterator itr = student.iterator();
        while(itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println(st.id + " " + st.name + " " + st.course);
        }
    }
}

class Student{
    String name;
    int id;
    String course;
    
    public Student(String name, int id, String course){
        this.name = name;
        this.id = id;
        this.course = course;
    }
}
