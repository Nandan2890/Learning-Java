package com.practice.arrayList.StringQues;

public class ReverseString3 {
    
    public static void reverse(char[] ch, int start, int end){
        char temp;
        while(start <= end){
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
    
    public static char[]  reverseWords(char[] ch){
        int start = 0;
        for(int end = 0; end < ch.length; end++){
            if(ch[end] == ' '){
                reverse(ch, start, end);
                start = end+1;
            }
        }
        
        //reverse the last word
        reverse(ch, start, ch.length-1);
        
        //reverse the entire string
        reverse(ch, 0, ch.length-1);
        
        return ch;
    }
    
    public static void main(String[] args){
        String str=" i like this program very much ";
        
        char[] p = reverseWords(str.toCharArray());
        System.out.println(p);
    }
}
