package manavKasaHesaplama;

import java.util.Scanner;

public class manavKasaHesaplama {

    public static void main(String[] args) {

        int armut,elma,domates,muz,patlican;
        double arm =2.14, elm =3.67, dom = 1.11, mz = 0.95, pat = 5.0, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç kg ? :");
        armut = input.nextInt();

        System.out.print("Elma Kaç kg ? :");
        elma = input.nextInt();

        System.out.print("Domates Kaç kg ? : ");
        domates = input.nextInt();

        System.out.print("Muz Kaç kg ? :");
        muz = input.nextInt();

        System.out.print("Patlıcan Kaç kg ? :");
        patlican = input.nextInt();

        total = ((arm * armut) + (elm * elma) + (dom * domates) + (mz * muz) + (pat * patlican));
        System.out.println("Toplam Ödenecek Tutar .:" + total + "TL");

    }
}
