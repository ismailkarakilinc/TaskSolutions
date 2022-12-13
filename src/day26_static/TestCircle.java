package day26_static;

public class TestCircle {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        System.out.println(circle1);
        System.out.println("Circle Area is: " + circle1.calcArea());
        System.out.println("Circle Perimeter is: " + circle1.calcPerimeter());
        Circle.printPI();
    }
}
