package com.example.elsticsrch.elasticSerachDemo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintWriter;
import java.io.StringWriter;

@RestController
public class AppController {
    private static final Logger Logger = LogManager.getLogger(AppController.class);

    @RequestMapping("/products")
    public String getProducts(){
        Logger.info("in get products" + "\n" + "my own procuts application");
        try {
            throw new Exception("exception has occured");
        }
        catch (Exception ex){
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);
            String stackTrace = sw.toString();
            Logger.error("exception"+ex.getMessage());
            Logger.error("exception"+stackTrace);
        }
        return "product1,product2,product3";
    }

}
