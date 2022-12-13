package day09_practice;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the math operator: ");
            char operator = input.next().charAt(0);

            if (operator=='+' || operator=='-' || operator=='*' || operator=='/') {
                System.out.print("Enter the second number: ");
                double num2 = input.nextDouble();
                    if (operator=='+'){
                        System.out.println("Result:"+(num1+num2));
                    }else if (operator=='-'){
                        System.out.println("Result:"+(num1-num2));
                    } else if (operator=='*'){
                        System.out.println("Result:"+num1*num2);
                    }else {
                        System.out.println("Result:"+num1/num2);
                    }
            }else {
                System.out.println("Invalid Entry");
            }
        }
    }


