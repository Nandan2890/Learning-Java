package com.practice.arrayList.StringQues;

public class ReverseString4 {
    
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
    
    public static char[]  reverseWords(char[] s){
        int word_begin = -1;
        
        int i = 0; 
        
        while(i < s.length){
            if((word_begin == -1) && (s[i] != ' ')){
                word_begin = i;
            }
            
            if(word_begin != -1 && ((i+1 == s.length) || (s[i+1] == ' '))){
                reverse(s, word_begin, i);
                word_begin = -1;
            }
            i++;
        }
        
        reverse(s,0,(s.length-1));
        return s;
    }
    
    public static void main(String[] args){
        String str=" i like this program very much ";
        
        char[] p = reverseWords(str.toCharArray());
        System.out.println(p);
    }
}
