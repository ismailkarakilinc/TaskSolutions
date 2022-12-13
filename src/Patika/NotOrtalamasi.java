import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {

        int matematik , fizik , kimya , turkce , tarih , muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik not ortalamasini giriniz= " );

        matematik = input.nextInt();

        System.out.print("Fizik not ortalamasini giriniz= " );

        fizik = input.nextInt();

        System.out.print("Kimya not ortalamasini giriniz= " );

        kimya = input.nextInt();

        System.out.print("Turkce not ortalamasini giriniz= " );

        turkce = input.nextInt();

        System.out.print("Tarih not ortalamasini giriniz= " );

        tarih = input.nextInt();

        System.out.print("Muzik not ortalamasini giriniz= " );

        muzik = input.nextInt();

        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;

        double sonuc = toplam/6;

        System.out.println("Sonuc = " + sonuc);
    }
}
