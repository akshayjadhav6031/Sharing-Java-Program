package javastring;

public class JavaStringSplit {
    public static void main(String[] args) {
        String s1 = "Java String Split";
        String[] s2 = s1.split("S",2);
        for (String s3 : s2)
                   System.out.println(s3);

    }
}
