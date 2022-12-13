package day09_practice;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the radius of the circle : ");

        int r = input.nextInt();

        double area = 3.14 * r * r;
        double perimeter = 2* 3.14 * r;

        System.out.println("The area of the circle is : " + area);
        System.out.println("The perimeter of the circle is : " + perimeter);

    }
}
/*

2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius


 */
