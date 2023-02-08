package com.test.String;

public class RemoveSpecialChar {

    public static void removeSpecialCharacter(){
        //write a program to remove all special characters from given String
        String input = "j@#a*va$%St!a@#r";
        //regex will
        String s = input.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("s  after = " + s);
    }
    public static void removeWhiteSpace(){
        String str = "Gaurav      Kumar     roy";
        str = str.replaceAll("\\s", "");
        System.out.println("String after removing white spaces: " + str);

        String st = "   gaurav    kumar     ";
        String trim = st.trim();
        System.out.println("trim removes spaces before and after but not middle = " + trim);



        String s="     J    a    v   a";
        System.out.println(s.replace(" ",""));
    }
    public static void main(String[] args) {

        //remove white space
        removeWhiteSpace();
        removeSpecialCharacter();


    }
}
