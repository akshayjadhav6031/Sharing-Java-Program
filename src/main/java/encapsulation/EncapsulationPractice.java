package encapsulation;

public class EncapsulationPractice {
    private String employeeName;
    private int accNo;
    private int payableAmount;
    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){

        System.out.println(employeeName);
    }
    public int getAccNo(){
        return accNo;
    }
    public void setAccNo(int accNo){
        this.accNo=accNo;
        System.out.println(accNo);
    }
    public int getPayableAmount(){
        return  payableAmount;
    }
    public void setPayableAmount(int payableAmount){

        System.out.println(payableAmount);
    }

    public static void main(String[] args) {
        EncapsulationPractice practice = new EncapsulationPractice();
        practice.setAccNo(1);
        practice.setEmployeeName("akshay");
        practice.setPayableAmount(1555555);
        System.out.println(practice.getAccNo());
        System.out.println(practice.getEmployeeName());
    }
}
