package day28_encapsulation;

public class TestCircle {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5.5);

        System.out.println("Area = " + circle1.calcArea());
        System.out.println("Perimeter = " + circle1.calcPerimeter());

        //circle1.setRadius(-10);   //  Radius can not be less than or equal zero

        System.out.println(circle1);
    }
}
