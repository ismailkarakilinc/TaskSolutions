package day21_MultiDimensionalArray;

public class Task2 {

    public static void main(String[] args) {

        String[][] items = {{"Apple", "Banana", "Grape", "Avocado"}, {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        for (String[] eachGroup : items ) {
            for (String eachItems : eachGroup){
                System.out.print(eachItems + "\t");
            }
            System.out.println("");
        }

        System.out.println("---------------------------------------------");
        for (int j = 0 ; j < items.length ; j++) {
            for (int i = items[j].length-1; i >=0 ; i--) {
                System.out.print(items[j][i]+ "\t");
        }
            System.out.println("");

        }
        System.out.println("--------------------------------------------------");
        for (int k = items.length-1 ; k >= 0 ; k--) {
            for (int a = 0 ; a < items[k].length ; a++) {
                System.out.print(items[k][a]+ "\t");
            }
            System.out.println("");

    }
}
}
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado

 */
