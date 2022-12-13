package day27_staticContinue;

public class TestCydeoStudent {

    public static void main(String[] args) {
        CydeoStudent student1=new CydeoStudent("Asiya","B28","A11",'F',35);
        CydeoStudent student2=new CydeoStudent("Ali","B28","A12",'M',45);
        CydeoStudent student3=new CydeoStudent("Mohd","B27","A13",'A',40);
        student3.study();
        student1.attendClass();
        System.out.println(student2);
        System.out.println(student2.name+ " " + student2.age + " years old.");
        if (student2.batchNumber.equals(student3.batchNumber)){
            System.out.println("They both are in same batch");
        }else {
            System.out.println("They are in different batches");
        }
    }
}
