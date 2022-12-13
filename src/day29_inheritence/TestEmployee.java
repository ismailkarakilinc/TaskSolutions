package day29_inheritence;

public class TestEmployee {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        teacher1.setInfo("Ismail",'M',27,2354,"SDET",120000);
        System.out.println(teacher1);
        teacher1.teaching();

        Driver driver1 = new Driver();
        driver1.setInfo("Ismail",'M',27,2354,"SDET",120000);
        driver1.testing();
    }
}
