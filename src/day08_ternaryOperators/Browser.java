package day08_ternaryOperators;

public class Browser {
    public static void main(String[] args) {

        String browserName = "edge";

        switch (browserName){
            case "chrome":
                System.out.println(browserName);
                break;
            case "firefox":
                System.out.println(browserName);
                break;
            case "opera":
                System.out.println(browserName);
                break;
            case "safari":
                System.out.println(browserName);
                break;
            case "edge":
                System.out.println(browserName);
                break;
            default:
                System.out.println("Invalid Browser");
        }

    }
}
/*
9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */
