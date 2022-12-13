package day27_staticContinue;

public class TestDog {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Husky","Brown",'M','M',4,true);
            Dog dog2=new Dog("Bull dog","White",'S','F',6,false);
            Dog dog3=new Dog("Husky","White",'L','M',2,true);
            Dog dog4=new Dog("German Shepherd","Black",'L','F',2,false);
            dog1.eat();
            dog2.drink();
            dog3.play();
            dog4.sleep();
            System.out.println("All dogs have "+Dog.numberOfLegs+" legs.");
            System.out.println(dog2);
        }
    }

