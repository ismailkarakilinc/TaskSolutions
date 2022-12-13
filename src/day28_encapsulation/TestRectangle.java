package day28_encapsulation;

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(4,2);
        System.out.println(rec1);
        System.out.println("Area = " + rec1.calcArea());
        System.out.println("Perimeter = " + rec1.calcPerimeter());
    }
}
