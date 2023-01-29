package encapsulation;

public class WriteOnlyClass3 {
    private String College;
    private String year;
    public void setCollege(String College,int year){
        this.College = College;
        System.out.println("clg name"+" "+College);
        System.out.println("year"+" "+year);
    }

    public static void main(String[] args) {
        WriteOnlyClass3 q = new WriteOnlyClass3();
        q.setCollege("gpkp",2022);
    }
}
