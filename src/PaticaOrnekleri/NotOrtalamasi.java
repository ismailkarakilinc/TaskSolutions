package PaticaOrnekleri;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        //Degiskenleri olustur.

        int mat, fizik, kimya, biyoloji,beden;

        // Cikti almak icin Scanner sinifini tanimla.

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat= inp.nextInt();

        System.out.print("Fizik notunuz:");
        fizik= inp.nextInt();

        System.out.print("Kimya notunuz:");
        kimya= inp.nextInt();

        System.out.print("Biyoloji notunuz:");
        biyoloji= inp.nextInt();

        System.out.print("Beden notunuz:");
        beden= inp.nextInt();

        int toplam = (mat + fizik + kimya + beden + biyoloji);
        double sonuc = toplam / 5;

        System.out.println("sonuc:"+sonuc);
    }
}
