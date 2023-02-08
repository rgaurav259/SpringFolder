package com.test.String;

public class EenStringPrint {
    public static  void  EenStringPrint(){
        String str = "hell javas rama  ra  ragh  raghav  shyam  sita";
        //String[] split = str.split("");
        for (String s : str.split(" ")){
                if (s.length()%2==0){
                    System.out.println(s);
                }

        }
    }
    
    public static void wordReverse(){
        String str = "hello world gaurav kumar";
        char[] chars = str.toCharArray();
        String rev = "";
        for (int i = chars.length-1; i>0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);//ouptut : ramuk varuag dlrow olle
    }
    public static void wordReverseUsingRegex(){
        String str = "hello world gaurav kumar";
        String[] s = str.split(" ");
        for (int i = s.length-1; i>=0; i--){
            System.out.print(" " + s[i]); //output :kumar gaurav world hello
        }
        System.out.println();
    }


    public static void countNumberOfWordsinString(){
        String str = "kumar gaurav world hello";
        String[] split = str.split("");
        System.out.println("length of string is total  = " + split.length);
    }
    public static void main(String[] args) {
       //EenStringPrint();
         wordReverse();
         wordReverseUsingRegex();
         countNumberOfWordsinString();
    }
}
