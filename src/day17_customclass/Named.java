package day17_customclass;

public class Named {

    public String name;
    public char gender;
    public int age;
    public int studentId;
    public char grade;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, int studentId, char grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Named{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId=" + studentId +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }
    public void study(){
        System.out.println(name + " is studying");
}
    public void grade(){
        System.out.println(name + " is " + age + " years old.He grade with " + grade + " " +
                "and his student ID is " + studentId );
    }
}
/*
2. Create a custom class named

		Attributes:
			name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()
 */
