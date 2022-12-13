package day17_customclass;

public class Rectangle {

    public double length;
    public double width;

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return  2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
