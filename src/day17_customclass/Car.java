package day17_customclass;

public class Car {

    public String make;
    public String model;
    public int year;
    public  String color;
    public int price;

    public void setInfo(String make, String model, int year, String color, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void start(){
        System.out.println(make + " " + model + " car start running");
    }

    public void cost(){
        System.out.println(make + " " + model + " car cost is $" + price);
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
