package day29_inheritence;

public class TestPhoneTask {

    public static void main(String[] args) {

        Nokia nokia1 = new Nokia("Nokia","3310","extra large",500,"blue");
        System.out.println(nokia1);
        nokia1.selfDefence();
        nokia1.call(1234354125);

        Iphone iphone1 = new Iphone("Apple","14 pro","Large",1000,"black");
        System.out.println(iphone1);
        iphone1.faceTime(1121243124);

        Samsung samsung1 = new Samsung("Samsung","S10","Large", 1100,"red");
        System.out.println(samsung1);
        samsung1.text(1242315125);


    }
}
