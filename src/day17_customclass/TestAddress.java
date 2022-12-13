package day17_customclass;

public class TestAddress {

    public static void main(String[] args) {

        Address address1 = new Address();
        address1.setInfo(681,"ElmSpring","Pittsburgh","PA",15220);

        System.out.println(address1);
        System.out.println(address1.buildingNumber+" "+address1.street+"\n"+address1.city+" "+
                address1.state+", "+address1.zipCode);
    }
}
