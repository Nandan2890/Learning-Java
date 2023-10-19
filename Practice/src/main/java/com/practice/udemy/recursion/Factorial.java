package com.practice.udemy.recursion;
import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n==1) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of times: ");
        int times = scan.nextInt();
        int i = 0;
        while(i < times){
            System.out.println("Enter the number:");
            int n = scan.nextInt();
            System.out.println("The factorial of " + n + " is " + factorial(n));
            i++;
        }
    }
}
