package com.collections;

import java.io.FileReader;
import java.util.Properties;

public class JavaProperties2 {
    public static void main(String[] args)throws Exception{
        FileReader reader = new FileReader("C:/Users/Akshay/Downloads.exe");

        Properties p=new Properties();
        p.load(reader);

        System.out.println(p.getProperty("user"));
    }
}
