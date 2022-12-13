package day13_customMethods;

public class Max {

    public static void main(String[] args) {

        System.out.println(max(12,34));


    }

    public static int max (int num1,int num2){

        if (num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }

}
/*

3. Create a method named max, that can return the maximum number between two numbers

 */
