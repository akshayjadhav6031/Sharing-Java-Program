package superkeywordinjava;

public class Tester extends Developer {
    int salary = 100001;
    public void NetSalary(){
        System.out.println(salary+super.salary);
    }

    public static void main(String[] args) {
        Tester t = new Tester();
        t.NetSalary();
    }
}

