package day17_customclass;

public class SalaryCalculatorTest {

    public static void main(String[] args) {

        SalaryCalculator salaryCalculator1 = new SalaryCalculator();

        salaryCalculator1.setInfo(25,8,10,50);

        System.out.println(salaryCalculator1);
        System.out.println("Salary is $" + salaryCalculator1.salary());
        System.out.println("State tax is $" + salaryCalculator1.stateTax());
        System.out.println("Federal tax is $" + salaryCalculator1.federalTax());
        System.out.println("Salary after tax is $" + salaryCalculator1.salaryAfterTax());
    }
}
