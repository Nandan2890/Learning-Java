package com.practice.linkedList;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Practice6 {
    public static void main(String[] args){
        String[] arr = {"Java", "Python", "Ruby", "JavaSCript"};
        System.out.println(Arrays.toString(arr));
        
        List<String> list = new ArrayList<>();
        
        for(String course: arr){
            list.add(course);
        }
        
        System.out.println(list);
    }
}
