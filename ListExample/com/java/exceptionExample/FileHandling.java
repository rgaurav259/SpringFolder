package com.java.exceptionExample;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try {
            fileRead();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    private static void fileRead() throws IOException {

        File file = new File("C:\\SpringFolder\\ListExample\\com\\java\\exceptionExample\\fileNew.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String s ="";
        while ((s= bufferedReader.readLine()) != null){
            System.out.println(s);
        }



    }
}
