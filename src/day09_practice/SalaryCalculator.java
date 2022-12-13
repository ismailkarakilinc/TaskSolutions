package day09_practice;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Your hourly rate:");
        double rate = input.nextDouble();

        System.out.print("How many hours do you work in a week? :");
        int hour = input.nextInt();

        System.out.print("State tax percentage:");
        double stateTax = input.nextDouble();

        System.out.print("Federal tax percentage:");
        double federalTax = input.nextDouble();

        double salary = rate * hour*52;
        System.out.println("Your salary is $" + salary);

        double stax = salary * stateTax / 100;
        System.out.println("State tax is $" + stax);

        double ftax = salary * federalTax / 100;
        System.out.println("Federal tax is $" + ftax);

        double totalTax = ftax + stax;
        System.out.println("Total tax is $" + totalTax);

        double netIncome = salary-totalTax;
        System.out.println("Total income is $" + netIncome);

    }
}
