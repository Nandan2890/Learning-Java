package com.practice.arrayList.StringQues;
import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = scan.nextLine();
        
        StringBuffer sb = new StringBuffer(string);
        sb.reverse();
        System.out.println(sb);
    }
}
