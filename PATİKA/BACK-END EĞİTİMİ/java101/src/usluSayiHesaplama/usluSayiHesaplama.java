package usluSayiHesaplama;

import  java.util.Scanner;
public class usluSayiHesaplama {

    public static void main(String[] args) {

        int us,n;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı : ");
         n= input.nextInt();

        System.out.print("Üs olacak Sayı : ");
        us = input.nextInt();

        int total =1;

        for (int i = 1; i <= us; i++){
            total *= n;
        }
        System.out.println("===================");
        System.out.println("CEVAP : " + total);
    }
}
