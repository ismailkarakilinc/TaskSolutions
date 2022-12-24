package day34_abstraction;

public class Tesla extends Car implements AutoPilot, AutoPark{

    public Tesla(String make, String model, int year, int price, String color) {
        super(make, model, year, price, color);
    }


    public void autopark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
