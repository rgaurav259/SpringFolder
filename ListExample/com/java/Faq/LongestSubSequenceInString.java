package com.java.Faq;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubSequenceInString {

    public static void  LenghtOfLongestSubstring(String s){
        String LongestSubstring = null;
        int LongestSubsStringLenght =0;

        //now using map
        Map<Character,Integer> map = new LinkedHashMap<>();//insertion order maintain linked hasmap
        char[] arr = s.toCharArray();
        for (int i =0; i< arr.length; i++){
            char ch = arr[i];
            if (!map.containsKey(ch)){
                map.put(ch,i);
            }else {
                i=map.get(ch);
                map.clear();
            }
            if (map.size()>LongestSubsStringLenght){
                LongestSubsStringLenght = map.size();
                LongestSubstring = map.keySet().toString();
            }
        }


        System.out.println("LongestSubsStringLenght = " + LongestSubsStringLenght);
        System.out.println("LongestSubstring = " + LongestSubstring);
    }
    public static void main(String[] args) {

        LenghtOfLongestSubstring("abbac");

        //write a java program to find the longest substring lenght which doesn't contain repeating chracters in
        //given string
        //Input abbac:  oupt bac Lenght is 3
        //input : abcabcbb  output is  abc lenght is 3
    }
}
