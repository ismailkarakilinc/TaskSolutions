package day07_ifStatements;

public class GradeLevelTwo {

    public static void main(String[] args) {

        int gradeLevel = 20; // Must be between 1~18. Otherwise write "Invalid Number."
        String result = "";

        if (gradeLevel>=1 && gradeLevel<19){

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
        }else {
            System.out.println("Invalid number.");
        }
    }
}
