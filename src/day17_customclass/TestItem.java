package day17_customclass;

public class TestItem {

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.setInfo("Apple",1,9);

        Item item2 = new Item();
        item2.setInfo("Grape",2,4);

        System.out.println(item1);
        System.out.println("Price of " + item1.name + " is: " +item1.calcCost());
        System.out.println(item2);
        System.out.println("Price of " + item2.name + " is: " +item2.calcCost());

        System.out.println("Total cost is: " + (item1.calcCost()+item2.calcCost()));
    }
}
