package abstraction;

public abstract class AbstractionJava {                           //abstract class
int u=1;


    public AbstractionJava(int x, int y) {                  //abstract parameterized constructor

        System.out.println(x + y);
    }

     AbstractionJava() {
        System.out.println("parent class default constructor");
    }

    private void m1(){
        String s ="sunday";
        System.out.println(s);
    }

    public static void NetPnL() {                   //only static method can run here
        int greenTrades = 15;
        int redTrades = 6;
        if
        (greenTrades >= redTrades)
            System.out.println("profitable");
        else
            System.out.println("not profitable");
    }

    public abstract void Index();                  //abstract method
    public abstract void Index2();

    public void GlobalIndex(){                      //simple method
        String SimilarIndex = "SGX Nifty";
        System.out.println(SimilarIndex+" "+"similar as nifty 50");
        m1();
    }

    public static void main(String[] args) {
        NetPnL();
    }
}
