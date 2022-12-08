package com.collections;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class JavaProperties {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\Akshay\\Downloads\\Automation_Testing-20220928T051219Z-001\\Automation_Testing");
        Properties docx = new Properties();
        docx.load(reader);
        System.out.println(docx.getProperty("w1"));
    }
}
