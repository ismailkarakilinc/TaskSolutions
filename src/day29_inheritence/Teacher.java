package day29_inheritence;

public class Teacher extends Employee {

    public void teaching(){
        System.out.println(getName() + " is teaching " + getJobTitle());
    }
}
