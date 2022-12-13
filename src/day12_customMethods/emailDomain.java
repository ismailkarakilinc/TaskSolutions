package day12_customMethods;

public class emailDomain {

    public static void main(String[] args) {


        String gmail = "Cydeo@gmail.com";

        String domain = gmail.substring(gmail.indexOf('@')+1, gmail.indexOf('.'));

        System.out.println("Domain: " + domain);
    }
}
/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */
