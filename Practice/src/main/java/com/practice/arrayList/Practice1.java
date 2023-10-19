package com.practice.arrayList;
import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args){
        ArrayList<String> stud = new ArrayList<>();
        stud.add("Nandan");
        stud.add("Kaushal");
        stud.add("Rohit");
        stud.add("Rohan");
        stud.add("Kamlesh");
        
        System.out.println(stud);
        for(String name: stud){
            System.out.println(name);
        }
    }
}
