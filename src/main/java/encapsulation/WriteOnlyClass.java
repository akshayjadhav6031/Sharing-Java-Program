package encapsulation;

public class WriteOnlyClass {
       public static void main(String[] args) {
        ReadOnlyClass ReadOnlyClass = new ReadOnlyClass();
        System.out.println(ReadOnlyClass.getX());
        System.out.println(ReadOnlyClass.getY());
//           ReadOnlyClass.setX(8,1);
//           ReadOnlyClass.setY(9);

       }
}
