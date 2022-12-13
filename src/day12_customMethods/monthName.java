package day12_customMethods;

public class monthName {

    public static void main(String[] args) {

        monthName(15);




    }

    public static void monthName(int number){

        String result = "";

        if (number>0 && number<12){

            switch (number){
                case 1:
                    result="January";
                    break;
                case 2:
                    result="February";
                    break;
                case 3:
                    result="March";
                    break;
                case 4:
                    result="April";
                    break;
                case 5:
                    result="May";
                    break;
                case 6:
                    result="June";
                    break;
                case 7:
                    result="July";
                    break;
                case 8:
                    result="August";
                    break;
                case 9:
                    result="September";
                    break;
                case 10:
                    result="October";
                    break;
                case 11:
                    result="November";
                    break;
                default:
                    result="December";

            } System.out.println(result);
        } else {
            System.out.println("Invalid number");

        }

    }
}
/*
3. Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */
