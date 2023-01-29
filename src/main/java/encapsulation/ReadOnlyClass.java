package encapsulation;
public class ReadOnlyClass {
           private int x = 10;
        private int y = 20;
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
    public void setX(int x,int y) {
        this.x = x;
        this.y = y;
        System.out.println(x+y);
    }
    public void setY(int y) {
            this.x = x;
        this.y = y;
        System.out.println(x-y);
    }
    public static void main(String[] args) {
        ReadOnlyClass ReadOnlyClass = new ReadOnlyClass();
        System.out.println(ReadOnlyClass.getX());
        System.out.println(ReadOnlyClass.getY());
        ReadOnlyClass.setX(1,2);
        ReadOnlyClass.setY(7);
            }

    }
