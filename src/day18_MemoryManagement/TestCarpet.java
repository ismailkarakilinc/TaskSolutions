package day18_MemoryManagement;

public class TestCarpet {

    public static void main(String[] args) {


        Carpet carpet1 = new Carpet();

        carpet1.setInfo(5,4,6.5,true);


        System.out.println(carpet1);
        System.out.println(carpet1.calcCost());
    }


}
