package day34_abstraction;

public abstract class Car {

    private final String make, model;
    private final int year;
    private int price;
    private String color;

    public Car(String make, String model, int year, int price, String color) {
        if (make.isEmpty() || make == null){
            System.err.println(make + " can not be empty , blank or null !!!");
            System.exit(1);
        }
        this.make = make;
        if (model.isEmpty() || model == null){
            System.err.println(model + " can not be empty , blank or null !!!");
            System.exit(1);
        }
        this.model = model;
        if (year<1886){
            System.err.println("Year can not be less than 1886!!!");
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        if (price<0){
            System.err.println("Price can not be negative!!!");
            System.exit(1);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color == null){
            System.err.println(color + " can not be empty , blank or null !!!");
            System.exit(1);
        }
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    public final void stop(){
        System.out.println("Press the break for stop " + make + " " + model);
    }

    @Override
    public String toString() {
        return make + "{" +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Car Task:
	1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()


	2. Create an interface named AutoPark
				Variables:
					hasAutoPark

				Abstract method:
					autoPark();

	3. Create a child interface of AutoPark named AutoPilot
						hint: interface can inherit from another interface by using extend keyword
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();

	4. Create an interface named Flyable
				Variables:
						canFly

				Abstract Method
					fly();


	5. Create a subclass of Car named Toyota

	6. Create a sub class of Car named Honda

	7. Create a subclass of Car named BMW

	8. Create two sub class of Car named Audi &  Mercedes that implements AutoPark interface

	9. Create Two sub classes of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces

	10 Create a sub class of Car named CydeoCar that implements AutoPark, AutoPilot and Flyable interfaces

	11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes

 */