package javastring;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        int x;
        int y;
        System.out.println("Enter Two Numbers :");
        Scanner r = new Scanner(System.in);
        x = r.nextInt();
        y = r.nextInt();
        System.out.println(x+y);
    }
}
