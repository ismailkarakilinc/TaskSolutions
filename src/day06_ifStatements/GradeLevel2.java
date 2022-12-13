package day06_ifStatements;

public class GradeLevel2 {

    public static void main(String[] args) {

        /*
        1. Create a class named GradeLevel.java
        2. An integer variable named gradeLevel is declared and given, Write
        a program to determine and print which school type someone is in
            Ex:
            gradeLevel = 2
            output:
            Elementary School
                The grade level and types are:
                    1 ~ 5: Elementary school
                    6 ~ 8: Middle school
                    9 ~ 12: High school
                    13 ~ 16: College
                    17 ~ 18: Grad School
                Assume that the given number is 1 ~ 18

         */

        int gradeLevel = 11;

        String result = "" ;  //Temporary value

        if (gradeLevel>0 && gradeLevel<6){
            result = "Elementary school";
        }
        if (gradeLevel>5 && gradeLevel<9){
            result = "Middle school";
        }
        if (gradeLevel>8 && gradeLevel<13){
            result = "High school";
        }
        if (gradeLevel>12 && gradeLevel<17){
            result = "College";
        }
        if (gradeLevel>16 && gradeLevel<19){
            result = "Grad School";
        }

        System.out.println(result);

    }
}

