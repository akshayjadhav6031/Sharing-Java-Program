package com.javafiles;

import java.io.File;
import java.io.IOException;

public class FilesInJava {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/Test Cases");
        System.out.println(file.createNewFile());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.isAbsolute());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.toPath());
        System.out.println(file.toURI());


    }
}
