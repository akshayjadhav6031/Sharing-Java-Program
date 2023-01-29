package javastring;

public class StringOddPositions {
    public static void main(String[] args) {
        String s= "Basics Of Java";
        for (int i=0;i<=s.length()-1;i++)
            if (i%2!=0)
        System.out.println("char at "+i+ "place" +"  "+s.charAt(i));
    }
}
