package day27_staticContinue;

public class Iphone {

    public static String brand;
    public String model;
    public int size;
    public String color;
    public int price;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn;
    public static String designedIn;

    public Iphone(String model, int size, String color, int price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    static {
        brand = "Apple";
        OS = "IOS";
        madeIn = "China";
        designedIn = "California";
        isSmartPhone = true;
    }

    public static void printOperatingSystem(){
        System.out.println("The operating system of Iphone is: " + OS);
    }
    public void call(long phoneNumber) {
        System.out.println("To call use this number: " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("To text use this number: " + phoneNumber);
    }

    public void faceTime(long phoneNumber) {
        System.out.println("To faceTime use this number: " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println("To faceTime use this email address: " + email);
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

/*
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */
