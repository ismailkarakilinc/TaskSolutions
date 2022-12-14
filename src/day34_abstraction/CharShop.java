package day34_abstraction;

public class CharShop {

    public static void main(String[] args) {

        Toyota toyota1 = new Toyota("Toyota","Prius",2010,8000,"Blue");
        Audi audi1 = new Audi("Audi","A5",2018, 27000,"Black");
        Bmw bmw1 = new Bmw("BMW","X6",2022,57000,"White");
        Honda honda1 = new Honda("Honda","insight",2020,27000,"Grey");
        Mercedes mercedes1 = new Mercedes("Mercedes","C300",2017,21000,"white");
        Nio nio1 = new Nio("Nio","X",2020,25000,"Red");
        Tesla tesla1 = new Tesla( "Tesla","Mode X",2022, 38000,"White");
        CydeoCar cydeoCar1 = new CydeoCar("Cydeo Car","Regrettion",2023,58000,"Green");

        System.out.println(toyota1);
        System.out.println(tesla1);
        System.out.println(audi1);
        System.out.println(bmw1);
        System.out.println(honda1);
        System.out.println(mercedes1);
        System.out.println(nio1);
        System.out.println(cydeoCar1);

        System.out.println("============================================================");

        honda1.stop();
        cydeoCar1.fly();
        cydeoCar1.autopark();
        tesla1.autopark();
        bmw1.drive();

        System.out.println("===============================================");
    }
}
