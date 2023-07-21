package recursiveUsluSayi;

import java.util.Scanner;

public class recursiveUsluSayi {

    static int UsAlma() {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini Giriniz : ");
        int taban = input.nextInt();

        System.out.print("Üs değerini Giriniz : ");
        int us = input.nextInt();

        int result = 1;

        if (us == 0) {
            return 1;

        } else {
            for (int i = 1; i <= us; i++) {
                result *= taban;
            }
            return result;
        }
    }


    public static void main(String[] args) {
        System.out.print("Sonuç : " + (UsAlma()));
    }


}