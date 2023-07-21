package kdvHesaplama;

import java.util.Scanner;

public class kdvHesaplama {

    public static void main(String[] args) {

        double fiyat, kdv = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Kdv'si Hesaplanacak Tutarı Giriniz : ");
        fiyat = input.nextDouble();

        double kdvOran = fiyat < 1000 ?  0.18 :  0.8;
        double kdvTutari= kdv * fiyat;
        double kdvliTutar= fiyat+kdvTutari;

        System.out.println("KDV'siz Fiyat = " + fiyat);
        System.out.println("KDV Oranı = " + kdv);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV'li Fiyat = " + kdvliTutar);
        System.out.println("KDV tutarı = " + kdvTutari);



    }
}
