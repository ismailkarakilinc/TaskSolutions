package day27_staticContinue;

public class TestIphone {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("14 pro max",128,"black",1100);
        Iphone iphone2 = new Iphone("13 Pro", 256, "Blue", 999);
        Iphone iphone3 = new Iphone("12", 256, "Red", 875);

        System.out.println(iphone1);
        System.out.println(iphone2);
        System.out.println(iphone3);

        System.out.println("Iphone Brand: " + Iphone.brand);
        System.out.println("Iphone O/S: " + Iphone.OS);
        System.out.println("Iphone design in: " + Iphone.designedIn);
        System.out.println("Iphone made in " + Iphone.madeIn);
        System.out.println("Iphone is a SmartPhone: " + Iphone.isSmartPhone);
        iphone1.printOperatingSystem();
        iphone2.call(1234576546);
        iphone3.text(1251456646);
        iphone1.faceTime("Iphone@apple.com");
    }

}
