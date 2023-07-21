package armstrongSayiDersi;

import java.util.Scanner;

public class basamaktoplami {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi=input.nextInt();

        int basamakToplam = 0;
        int tempNumber = sayi;

        while (tempNumber != 0) {
            int basamak = tempNumber % 10;
            basamakToplam += basamak;
            tempNumber /= 10;
        }

        System.out.println("Girilen sayının basamaklarının toplamı: " + basamakToplam);
    }
}

