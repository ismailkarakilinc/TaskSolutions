package day07_ifStatements;

public class Browser {

    public static void main(String[] args) {

        /*
        2. Create a class called Browser. Write a program that can display the name of selected browser
            1. declare a String variable named browserName
            2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
            3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

            Ex:
                String browser = "chrome";

            Output:
                Chrome Browser is selected

            Note: MUST use nested if
         */

        String browserName = "Chrome";

        if (browserName=="Chrome" || browserName=="Firefox" || browserName=="Opera" || browserName=="Safari" ||
                browserName=="Edge"){
            if (browserName=="Chrome"){
                System.out.println("Chrome browser is selected.");
            } else if (browserName=="Firefox"){
                System.out.println("Firefox browser is selected.");
            }else if (browserName=="Opera"){
                System.out.println("Opera browser is selected.");
            }else if (browserName=="Safari"){
                System.out.println("Safari browser is selected.");
            }else{
                System.out.println("Edge browser is selected.");
            }
        }else{
                System.out.println("Invalid Browser Name.");
            }
        }
    }

