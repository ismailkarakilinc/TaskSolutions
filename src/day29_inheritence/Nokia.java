package day29_inheritence;

public class Nokia extends phoneTask {


    public Nokia(String brand, String model, String size, int price, String color) {
        super(brand = "Nokia", model, size, price, color);
    }

    public void call(long phoneNumber){
        System.out.println(phoneNumber + " is calling");
    }
    public void text(long phoneNumber){
        System.out.println(phoneNumber + " is texting");
    }
    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber + " is facetiming");
    }
    public void faceTime(String email){
        System.out.println(email + " is facetiming");
    }

    public void selfDefence(){
        System.out.println(getBrand() + " " + getModel() + " has seldefence");
    }
}
