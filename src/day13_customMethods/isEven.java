package day13_customMethods;

public class isEven {

    public static void main(String[] args) {

        System.out.println(isEven(100));
    }


    public static boolean isEven(int num){
        return (num % 2 == 0) ? true : false ;
    }
}
/*
2. Create a method named isEven, that can return true if a number is an even number, otherwise returns false

 */
