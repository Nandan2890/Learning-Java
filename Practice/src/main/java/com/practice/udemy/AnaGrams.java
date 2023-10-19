package com.practice.udemy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class AnaGrams {
    
    public static List<List<String>> groupAnagrams(String[] strings){
        Map<String, List<String>> anagramGroups = new HashMap<>();
        
        for(String string : strings){
            char[] chars = string.toCharArray();
            
            Arrays.sort(chars);
            String canonical = new String(chars);
            if(anagramGroups.containsKey(canonical)){
                anagramGroups.get(canonical).add(string);
            } else{
                List<String> group = new ArrayList<>();
                group.add(string);
                anagramGroups.put(canonical, group);
            }
        }
        
        return new ArrayList<>(anagramGroups.values());
    }
    
    public static void main(String[] args){
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));
    }
}
