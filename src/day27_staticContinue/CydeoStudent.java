package day27_staticContinue;

public class CydeoStudent {

    public String name,batchNumber,groupNumber;
    public char gender;
    public int age;
    public static String schoolName,fieldOfStudy,programmingLanguage,secretCode;

    public CydeoStudent(String name, String batchNumber, String groupNumber, char gender, int age) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.age = age;
    }
    static {
        schoolName = "Cydeo";
        fieldOfStudy = "SDET";
        programmingLanguage = "JAVA";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println("School name is: " + schoolName);
    }
    public static void printSecretCode(){
        System.out.println("Secret code is: " + secretCode);
    }
    public void attendClass(){
        System.out.println("Attend class: " + name);
    }
    public void study(){
        System.out.println(name + " is studying");
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()

 */