package day12_customMethods;

public class capitalization {

    public static void main(String[] args) {

        String firstName = "isMail";
        String lastName = "KarakILinC";

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);


    }
}
