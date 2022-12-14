package day34_abstraction;

public class Nio extends Car implements AutoPark, AutoPilot{

    public Nio(String make, String model, int year, int price, String color) {
        super(make, model, year, price, color);
    }

    @Override
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
