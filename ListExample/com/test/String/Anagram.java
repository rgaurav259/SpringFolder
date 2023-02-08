package com.test.String;
import java.util.Arrays;
import java.util.Scanner;


public class Anagram {


    public static void checkAnagramFromInput() {

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // take input from users
        System.out.print("Enter first String: ");
        String str1 = input.nextLine();
        System.out.print("Enter second String: ");
        String str2 = input.nextLine();

        // check if length is same
        if (str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }

        input.close();

    }


    public static void checkAnagram() {
        String str1 = "Ram";
        String str2 = "Mar";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if length is same
        if (str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);


            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }

    }



        public static boolean isAnagram(String string1, String string2) {
            // Remove spaces and convert to lowercase or uppercase
            string1 = string1.replaceAll("\\s", "").toLowerCase();
            string2 = string2.replaceAll("\\s", "").toLowerCase();

            // Convert strings to character arrays
            char[] charArray1 = string1.toCharArray();
            char[] charArray2 = string2.toCharArray();

            // Sort both arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare both arrays
            return Arrays.equals(charArray1, charArray2);
        }



        public static void anagrams() {
            String str1 = "aab";
            String str2 = "Baa";


            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // check if length is same
            if (str1.length() == str2.length()) {

                //convert char Array
                char[] chars1 = str1.toCharArray();
                char[] chars2 = str2.toCharArray();

                //now sort
                Arrays.sort(chars1);
                Arrays.sort(chars2);

                boolean equals = Arrays.equals(chars1, chars2);
                System.out.println("isAnagrams both the Strings = " + equals);

                if (equals) {
                    System.out.println(str1 + " and " + str2 + " are anagram.");
                } else {
                    System.out.println(str1 + " and " + str2 + " are not anagram.");
                }

            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
    public static void main(String[] args) {
        //checkAnagram();
        //checkAnagramFromInput();
        anagrams();

        //third one for the boolean to check
//        System.out.println(Anagram.isAnagram("Listen", "silent")); // Output: true
//        System.out.println(Anagram.isAnagram("Triangle", "Integral")); // Output: true
//        System.out.println(Anagram.isAnagram("Hello", "World")); // Output: false


    }

}

