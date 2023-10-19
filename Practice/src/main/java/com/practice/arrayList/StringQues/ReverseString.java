package com.practice.arrayList.StringQues;
import java.util.Scanner;

public class ReverseString {
    
    public static String reverse(String string){
        int len = string.length();
        String str="";
        for(int i = len-1; i >= 0 ; i--){
            char ch = string.charAt(i);
            str += ch;
        }
        return str;
    }
    
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str=read.nextLine();
        
        System.out.println(reverse(str));
    }
}
