package com.java.Faq;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        String s = Solution.solution("helojava");
        System.out.println("repetitve words = " + s);
    }

    public  static   String solution(String S) {
            int[] occurrences = new int[26];
            int[] count = new int[26];
            for (char ch : S.toCharArray()) {
                occurrences[ch - 'a']++;
            }

            char best_char = 'a';
            int  best_res  = 0;

            for (int i = 1; i < 26; i++) {
                if (occurrences[i] >= best_res) {
                    best_char = (char)((int)'a' + i);
                    best_res  = occurrences[i];
                }
            }

            return Character.toString(best_char);
        }
    }

