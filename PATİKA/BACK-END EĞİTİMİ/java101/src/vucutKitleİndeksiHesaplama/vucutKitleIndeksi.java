package vucutKitleİndeksiHesaplama;
import java.util.Scanner;
public class vucutKitleIndeksi {

    public static void main(String[] args) {

        double boy,vki,kg;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (metre cinsinden) Giriniz .: ");
        boy = inp.nextDouble();

        System.out.print("Lütfen Kilonuzu Girin .: ");
        kg = inp.nextDouble();

        vki = kg / (boy* boy);
        System.out.print("Vücut Kitle İndeksiniz : " + vki);



    }
}
