package encapsulation;
public class EncapsulationPractice1 {
    private String candidateName;
    private int age;

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
        System.out.println("candidateName"+ " "+candidateName);
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age"+" "+age);
    }

    public static void main(String[] args) {
        EncapsulationPractice1 EncapsulationPractice1 = new EncapsulationPractice1();
        EncapsulationPractice1.setCandidateName("SURESH");
        EncapsulationPractice1.setAge(28);
           }
}

