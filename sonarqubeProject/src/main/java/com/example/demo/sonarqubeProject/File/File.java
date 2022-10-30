package com.example.demo.sonarqubeProject.File;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;

@Slf4j
public class File {
    private static Logger logger = LoggerFactory.getLogger(File.class);

    //this program is working but need to see the quality of code is good or not
    //we have to integrate sonarqube running in local to determine
    public static void main(String[] args) throws Exception {
        try (FileReader fr = new FileReader("data.txt")){
            try (BufferedReader br = new BufferedReader(fr)){
                String str = null;
                while ((str = br.readLine())!=null) {
                    logger.debug("Printing variable value: {}", str);
                }
            }

        }catch (Exception e){}

    }

}