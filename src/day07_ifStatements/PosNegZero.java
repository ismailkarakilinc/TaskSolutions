package day07_ifStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int number = 20;
        String result = "";

        if (number>0){
            result = "Pozitive";
        } else if (number<0){
            result = "Negative";
        }else {
            result = "Zero";
        }
        System.out.println(result);
    }
}
