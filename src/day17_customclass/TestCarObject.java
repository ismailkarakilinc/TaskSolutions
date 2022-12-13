package day17_customclass;

public class TestCarObject {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.model = "C300";
        car1.make = "Mercedes";
        car1.color = "Red";
        car1.year = 2;
        car1.price = 34000;

        System.out.println(car1);
        car1.start();
        car1.cost();
    }
}
/*
1. Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement, it should display all the information of the car object
			start()

 */
