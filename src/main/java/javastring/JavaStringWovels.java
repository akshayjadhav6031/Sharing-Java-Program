package javastring;

public class JavaStringWovels {
    public static void main(String[] args) {
        String s = "AKSEHAUUY JAODHIAV";
        for(int i=0;i<=s.length()-1;i++)
            if(s.charAt(i)=='A'|| s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U' ){
                System.out.print(s.charAt(i ));
            }

    }

}
