package day26_static;

public class TestCydeoStudent {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Isa",27,'M',2090,'A',"B27",1234);

        student1.study();
        student1.attendClass();
        student1.printSchoolName();
        student1.printProgLanguage();
        System.out.println(CydeoStudent.magicWord);
        System.out.println(CydeoStudent.schoolName);
        System.out.println(student1);
    }
}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */
