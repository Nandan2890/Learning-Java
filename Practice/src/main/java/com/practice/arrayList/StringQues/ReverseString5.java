package com.practice.arrayList.StringQues;

public class ReverseString5 {
    public static void main(String[] args){
        String[] s = "I like this program very much".split(" ");
        String ans="";
        for(int i = s.length-1; i >= 0; i--){
            ans += s[i]+" ";
        }
        
        System.out.println(ans.substring(0, ans.length()-1));
    }
}
