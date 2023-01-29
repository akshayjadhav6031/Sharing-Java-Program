package com.practice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/multithreaded & wrapper");
        FileReader fileReader = new FileReader(file);
        int i;
        while ((i = fileReader.read()) != -1){
            System.out.println((char) i);
            fileReader.close();
        }
    }
}
