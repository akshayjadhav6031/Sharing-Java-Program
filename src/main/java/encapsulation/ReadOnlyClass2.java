package encapsulation;

public class ReadOnlyClass2 {
    private int x ;

    public void setX(int x) {
        this.x = x;
        System.out.println(x);
    }
//    public int getX() {
//        return x;
//
//    }

    public static void main(String[] args) {
        ReadOnlyClass2 ReadOnlyClass2 = new ReadOnlyClass2();
        ReadOnlyClass2.setX(12);
            }
}
