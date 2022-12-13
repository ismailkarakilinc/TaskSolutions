package day07_ifStatements;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 2; // 1~18
        String result = "";

        if (gradeLevel<6){
            result="Elementary School";
        } else if (gradeLevel<9){
            result="Middle School";
        } else if (gradeLevel<13){
            result="High School";
        } else if (gradeLevel<17){
            result="College";
        } else{
            result="Grad School";
        }
        System.out.println(result);

    }
}
