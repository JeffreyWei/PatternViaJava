package com.jeffrey.pattern.decorate.fileimp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by wei on 15/5/2.
 */
public class Client {
    public static void main(String[] args) {
        try {
//            URL xmlConfig = Thread.currentThread().getContextClassLoader().getResource("logback.xml");
            URL url = Thread.currentThread().getContextClassLoader().getResource("testFile");
            InputStream is =new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(url.getFile())));
            int c;
            while((c=is.read())>=0){
                System.out.print((char)c);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
