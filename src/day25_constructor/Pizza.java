package day25_constructor;

public class Pizza {

        public char size;
        public int numberOfCheeseTopping;
        public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost() {
        int totalPrice = 0;
        if (size == 'S' || size == 's') {
            totalPrice = 10 + 2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        } else if (size == 'M' || size == 'm'){
            totalPrice = 12 + 2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        }else if (size == 'L' || size == 'l'){
            totalPrice = 14 + 2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        }else {
            System.out.println("Invalid entry!!! Please try again");
        }
        return totalPrice;
    }



    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalCost=" + calcCost() +
                '}';
    }
}



/*
        Task01:
        Create a custom class named Pizza:
        Attributes:
        size, numberOfCheeseTopping, numberOfPepperoniTopping

        Add a constructor that can set all the fields

        Actions:
        calcCost(): returns the totalCost of the pizza
        toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
        S: $10 + $2 per topping
        M: $12 + $2 per topping
        L: $14 + $2 per topping
        */


