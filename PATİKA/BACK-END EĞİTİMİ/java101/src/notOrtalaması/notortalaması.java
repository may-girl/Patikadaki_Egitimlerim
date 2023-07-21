package notOrtalaması;

import java.util.Scanner;

public class notortalaması {

    public static void main(String[] args) {

        //değişken tanımlanacak
        int mat, fizik, kimya, turkce, tarih, muzik;

        //kullanıcıdan değerler istenecek
        Scanner input = new Scanner(System.in);
        System.out.print(" Matematik notunuzu giriniz : ");
        mat = input.nextInt();

        System.out.print(" Fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.print(" Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.print(" Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();

        System.out.print(" Tarih notunuzu giriniz : ");
        tarih = input.nextInt();

        System.out.print(" Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        // ortalama hesaplanacak

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;
        System.out.println("Ders ORTALAMANIZ .: " + ortalama);

        // ekrana ortalama 60 ın sütündeye geçti, altındaysa kaldı yazılacak
        System.out.print(ortalama < 60 ? "ÜZGÜNÜM KALDINIZ :(" : "TEBRİKLER GEÇTİNİZ");

    }
}