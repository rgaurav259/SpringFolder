package com.java.Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesClassDemo {

    public static void main(String[] args) throws Exception{

        Properties p = new Properties();

        FileInputStream fis =new FileInputStream("abc.txt");
        p.load(fis);
        System.out.println(p);

     String s=  p.getProperty("venky");
        System.out.println(s);

        p.setProperty("nag","88888");
        FileOutputStream fos = new FileOutputStream("abc.txt");
        p.store(fos,"updated by gaurav kumar");




    }



}
