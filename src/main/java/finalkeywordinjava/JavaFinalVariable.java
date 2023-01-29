package finalkeywordinjava;

public class JavaFinalVariable {
    final int a = 40000;
    int b = 19000;
    public void addition(final int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        JavaFinalVariable f = new JavaFinalVariable();
        f.addition(4,5);
         }
}
