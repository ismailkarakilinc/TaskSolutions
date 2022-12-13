package day17_customclass;

public class Item {

    public String name;
    public int unitPrice;
    public int quantity;

    public void setInfo(String name, int unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public int calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
/*
6. Create a class called Item
    Attributes:
        name, unitPrice, quantity

    Actions:
    	setInfo(): sets all the fields of Item object
        calcCost(): returns the total price of the Item
        toString(): when a SalaryCalculator object is passed in print statement, it should display the full information
         of the item object
 */
