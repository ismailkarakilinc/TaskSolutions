package day17_customclass;

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.setInfo(4,5);

        System.out.println(rectangle1);

        System.out.println(rectangle1.area());

        System.out.println(rectangle1.perimeter());
    }
}
