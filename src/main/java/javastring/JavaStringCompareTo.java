package javastring;

public class JavaStringCompareTo {
    public static void main(String[] args) {
        String s1 = " Akshay";
        String s2 = "Akshay Jadhav";
        String s3 = "Akshay";
        String s4 = "Jadhav";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s4.compareTo(s1));
        System.out.println(s2.compareTo(s1));
    }
}