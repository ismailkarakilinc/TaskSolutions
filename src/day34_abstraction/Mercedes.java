package day34_abstraction;

public class Mercedes extends Car implements AutoPark{

    public Mercedes(String make, String model, int year, int price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autopark() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
