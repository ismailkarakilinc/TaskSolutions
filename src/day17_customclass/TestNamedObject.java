package day17_customclass;

public class TestNamedObject {

    public static void main(String[] args) {

        Named name1 = new Named();

        name1.name = "Ismail";
        name1.age = 27;
        name1.gender = 'M';
        name1.grade = 'A';
        name1.isFullTime = false;
        name1.studentId = 12354;

        name1.study();
        name1.grade();
    }
}
