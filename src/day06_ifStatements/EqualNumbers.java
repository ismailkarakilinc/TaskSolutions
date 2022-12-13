package day06_ifStatements;

public class EqualNumbers {

    public static void main(String[] args) {

        /*
        7. Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
         */
        int n1=5;
        int n2=5;
        int n3=58;

        if (n1==n2&&n2==n3){
            System.out.println("All equal.");
        }
        if ((n1!=n2 && n1!=n3 && n2!=n3)) {
            System.out.println("None of them are not equal.");
        }
        if (n1==n2 && n2!=n3){
            System.out.println("n1&n2 are equal numbers.");
        }
        if (n2==n3 && n2!=n1){
            System.out.println("n2&n3 are equal numbers.");
        }
        if (n1==n3 && n1!=n2){
            System.out.println("n1&n3 are equal numbers.");
        }


    }
}
