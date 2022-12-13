package day06_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {
        /*
        9. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax

         */

        double inCome = 100000;
        double tax = 0 ;


        boolean marry = true;

        if (inCome >= 130000) {
            tax = 0.35;

        }

        if (inCome >= 100000 && inCome < 130000) {
            tax = 0.30;


        }
        if (inCome >= 80000 && inCome < 100000) {
            tax = 0.25;


        }
        if (inCome < 80000) {
            tax = 0.20;
        }
        double result = (inCome - (inCome*tax));


        if (marry){
            double mTax = 0.05;
            System.out.println("Net income is " + (result + (result*mTax)));
        }else{
            System.out.println("Net income is " + result);
        }


        }

    }





