package ebobEkokHesaplama;

import java.util.Scanner;

public class ebobEkokHesaplama {

    public static void main(String[] args) {

        int k=1 ,i=1,sayi1,sayi2,ebob=1, ekok=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : ");
        sayi1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        sayi2 = input.nextInt();

        while (i<=sayi1) {
            i++;
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
        ekok=(sayi1*sayi2)/ebob;
        System.out.println("Ebob : " + ebob);
        System.out.print("Ekok : " + ekok);
    }
}
