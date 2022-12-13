package day12_customMethods;

import java.util.Scanner;

public class CoputerBuild {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price = 0;

        System.out.println("Select screen size:");
        double screenSize = input.nextDouble();


        if (screenSize == 13.3){
            price += 200;
        } else if (screenSize == 15.0){
            price += 300;
        } else if (screenSize == 17.3){
            price += 400;
        } else{
            price +=0;
        }

        System.out.println("Select CPU type:");
        String cpuType = input.next();

        if (cpuType == "i3"){
            price += 150;
        } else if (cpuType == "i5"){
            price += 250;
        } else if (cpuType == "i7"){
            price += 350;
        } else {
            price += 0;
        }


        System.out.println("Select RAM size:");
        int ramSize = input.nextInt();

        price += 50*ramSize/4;


        System.out.println("Select storage type:");
        String storageType = input.next();

        System.out.println("Select storage size:");
        int storageSize = input.nextInt();

        if (storageType == "HDD"){
            price += (storageSize / 500) * 50;
        }else {
            price += (storageSize/500) * 100;
        }

        System.out.println("Select screen resolution:");
        String resolution = input.next();

        if (resolution == "FULLHD"){
            price += 100;
        }else {
            price += 200;
        }

        System.out.println("Final price is: $" + price);
    }
}




