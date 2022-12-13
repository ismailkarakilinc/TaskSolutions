package day12_customMethods;

public class daysOfWeek {

    public static void main(String[] args) {

        day(13);

    }

    public static void day(int number){

        if (number>0 && number<8){
            switch (number){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Sunday");
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}
/*
4. Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday

 */

