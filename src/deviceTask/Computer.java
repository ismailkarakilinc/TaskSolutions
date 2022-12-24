package deviceTask;

public class Computer extends Device{

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Use turn on button to open " + getClass().getSimpleName());

    }

    @Override
    public void turnOff() {
        System.out.println("USe turn off button to turn off the " + getClass().getSimpleName());

    }
}
