package day09_practice;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        int speedLimit = 55;
        String result = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter your current speed : ");

        int currentSpeed = input.nextInt();

        if (currentSpeed>speedLimit){
            result="You're driving " + (currentSpeed-speedLimit)  + " mph over the limit. Slow down!";
        }else {
            result="Your speed is : " + currentSpeed;
        }
        System.out.println(result);



    }
}

/*

4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!
 */
