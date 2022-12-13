package day07_ifStatements;

public class GradeRaportTwo {

    public static void main(String[] args) {

        int score = 95;  //0~100
        String result = "";

        if (score>=0 && score<101){
            if (score>=90){
                result="A";
            } else if (score>=80){
                result="B";
            } else if (score>=70){
                result="C";
            } else if (score>=60){
                result="D";
            } else{
                result="F";
            }
            System.out.println("Your grade is " + result);
        }else {
            System.out.println("Invalid Number.");
        }
    }
}
