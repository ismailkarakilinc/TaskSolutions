package day34_abstraction;

public class CydeoCar extends Car implements AutoPilot, AutoPark, Flyable{

    public CydeoCar(String make, String model, int year, int price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autopark() {
        System.out.println(getMake()+" " + getModel()+ " has auto park future.");

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

    @Override
    public void fly() {

    }
}
