package day27_staticContinue;

public class TestPerson {

    public static void main(String[] args) {

        Person person1=new Person("Fatih","English",30,'M');
        Person person2=new Person("Perscilla","English",25,'F');
        Person person3=new Person("Ali","Turkish",35,'M');
        Person person4=new Person("Ajsa","Arabic",30,'F');
        person2.eat();
        person1.drink();
        System.out.println(person3);
        System.out.println(person3.name+" speaks "+ person3.language+" language.");
    }
}

