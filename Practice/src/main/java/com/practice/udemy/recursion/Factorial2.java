package com.practice.udemy.recursion;
import java.util.Scanner;

public class Factorial2 {
    public static int factorial(int n){
        if(n==1) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean b = true;
        while(b){
            System.out.println("Enter the number:");
            int n = scan.nextInt();
            System.out.println("The factorial of " + n + " is " + factorial(n));
            System.out.println("Enter the Y/N for repeat/no-repeat:");
            char ch = scan.next().charAt(0);
            if(ch == 'y' || ch == 'Y')
                b = true;
            else if(ch == 'n' || ch == 'N')
                b = false;
            else{
                System.out.println("You write wrong character please enter Y/N");
                b = false;
            }
        }
    }
}
