package day06_ifStatements;

public class AgeGroups {

    public static void main(String[] args) {

        /*
        6. Create a class named AgeGroups, an integer variable named age is declared and given. write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement
         */

        int age = 68;
        String result = "";

        if (age>0 && age <3){
            result="Infant";
        }
        if (age>2 && age <6){
            result="Toddler";
        }
        if (age>5 && age <10){
            result="Kid";
        }
        if (age>9 && age <13){
            result="Pre-Teen";
        }
        if (age>12 && age <18){
            result="Teenager";
        }
        if (age>17 && age <21){
            result="Young Adult";
        }
        if (age>20 && age <40){
            result="Adult";
        }
        if (age>39 && age <50){
            result="Young Middle-Aged Adult";
        }
        if (age>49 && age <55){
            result="Middle-Aged Adult";
        }
        if (age>54 && age <65){
            result=" Very Young Senior Citizen";
        }
        if (age>64 && age <75){
            result="Young Senior Citizen";
        }
        if (age>74 && age <85){
            result="Senior Citizen";
        }
        if (age>=85){
            result=" Old Senior Citizen";
        }
        System.out.println(result);
    }
}
