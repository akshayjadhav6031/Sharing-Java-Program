package javastring;

public class JavaStringBuffer {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer(" Akshay ");
        StringBuffer s2 = new StringBuffer(" Akshay Jadhav ");
        StringBuffer s3 = new StringBuffer("String Buffer Class");
        StringBuffer s4 = new StringBuffer("String Buffer Class");
        System.out.println(s1.append(" Jadhav"));
        System.out.println(s2.insert(7," Bajirao "));
        System.out.println(s3.replace(7,13,"Builder"));
        System.out.println(s4.delete(7,13));
        System.out.println(s4.reverse());
    }
}
