package day04_concatenation;

public class SalaryCalculatorr {

    public static void main(String[] args) {

        /*
        7. Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

                7.1 Use the given info above to calculate the followings:
                            salaryBeforeTax
                            stateTax
                            federalTax
                            totalTax
                            salaryAfterTax

                7.2 Display each of the above in the following format:
                    Ex:
                          hourlyRate = $50
                          weeklyHours = 45
                          stateTax = 6  (given as percentage)
                          federalTax = 26 (given as percentage)

                    output:
                           Gross pay is: $117000
                                Federal tax is: $30420
                                State tax is: $7020
                                Total tax is: $37440
                                 Net income is: $79560
         */

        int hourlyRate = 50, weeklyHours = 45, week=52;
        double stateTax = 0.06, federalTax = 0.26;

        int salaryBeforeTax = hourlyRate * weeklyHours * week;
        double stateTax1= salaryBeforeTax * stateTax;
        double federalTax1= salaryBeforeTax * federalTax;
        double totalTax = stateTax1 + federalTax1;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: " + "$" + salaryBeforeTax + "\n\tFederal Tax is: " + "$" + federalTax1 +
                "\n\tState tax is: $" + stateTax1 + "\n\tTotal tax is: $" + totalTax + "\n\tNet income is: $" + salaryAfterTax);

    }
}
