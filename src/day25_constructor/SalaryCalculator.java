package day25_constructor;

public class SalaryCalculator {

    public double hourlyRate;
    public int weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
    double salaryTotal = hourlyRate * weeklyHours * 52 ;
    return salaryTotal;
    }
    public double stateTax(){
        double stateTaxTotal = (stateTaxRate / 100 * hourlyRate * weeklyHours *52);
        return stateTaxTotal;
    }
    public double federalTax(){
        double federalTaxTotal = (federalTaxRate / 100 * hourlyRate * weeklyHours * 52);
        return federalTaxTotal;
    }
    public double salaryAfterTax(){
        double salAfterTax = (hourlyRate * weeklyHours * 52) - (federalTaxRate / 100 * hourlyRate * weeklyHours * 52) -
                (stateTaxRate / 100 * hourlyRate * weeklyHours *52);
        return salAfterTax;
    }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary=" + salary() +
                ", state tax=" + stateTax() +
                ", federal tax=" + federalTax() +
                ", salary after tax=" + salaryAfterTax() +
                '}';
    }
}
/*
Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */
