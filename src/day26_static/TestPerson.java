package day26_static;

public class TestPerson {

    public static void main(String[] args) {

        Person p1 = new Person("Ismail",27,'M');

        System.out.println(p1);

        p1.eat("Pizza");
        p1.drink("Coke");
        p1.sleep();
    }
}
