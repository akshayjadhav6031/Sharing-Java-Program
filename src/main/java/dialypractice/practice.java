package dialypractice;
public class practice {
    String s = "this is really simple sentence";
   // String vowels= ("a"||"e"||"i","o","u");

    public void m1() {
        System.out.println(s.length());
        if (s.contains("a||e||i")) {
            System.out.println("this is vowel");
        }else
            System.out.println("not");
        }

    public static void main(String[] args) {
        practice z = new practice();
        z.m1();
    }
    }
