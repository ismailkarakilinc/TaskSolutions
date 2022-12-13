package day11_string;

public class WebsiteAddress {

    public static void main(String[] args) {

        String website = "www.cydeo.com";

       boolean websiteBegan = website.startsWith("www.");
       boolean endCom = website.endsWith(".com");
       boolean endEdu = website.endsWith(".edu");
       boolean endGov = website.endsWith(".gov");

        if (websiteBegan && endCom || endEdu || endGov){
            System.out.println("Valid website");
        }else {
            System.out.println("Invalid website");
        }

    }
}
/*
1. Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov

 */
