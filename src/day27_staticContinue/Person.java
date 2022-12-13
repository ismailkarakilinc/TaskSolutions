package day27_staticContinue;

public class Person {

    public String name,language;
    public int age;
    public char gender;
    public static String planet;
    public static int numberOfWings, numberOfHead;
    public static boolean isHuman, hasNose;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }
    static {
        planet = "World";
        numberOfHead = 1;
        numberOfWings = 0;
        isHuman = true;
        hasNose = true;
    }
    public static void printPlanetName(){
        System.out.println("Planet name is: " + planet);
    }
    public void eat(){
        System.out.println(name + " is eating.");
    }
    public void drink(){
        System.out.println(name + " is drinking.");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
4. Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
 */
