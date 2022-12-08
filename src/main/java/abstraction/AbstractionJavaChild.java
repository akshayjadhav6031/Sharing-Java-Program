package abstraction;

public class AbstractionJavaChild extends AbstractionJava {
    private AbstractionJavaChild(){
        System.out.println("child class default constructor");
    }

    @Override
    public void Index() {
        System.out.println("a");
    }

    @Override
    public void Index2() {
        System.out.println("b");
    }

    public static void main(String[] args) {
        AbstractionJavaChild v = new AbstractionJavaChild();
        v.Index();
        v.Index2();
        v.GlobalIndex();
    }
}


