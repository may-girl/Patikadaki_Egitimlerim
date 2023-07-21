package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int sayi,i,total,n1=0,n2=1;

        Scanner input = new Scanner(System.in);

        System.out.print(" Kaç Elemanlı Fibonacci Sayısı İstiyorsunuz : ");
        sayi =input.nextInt();

        System.out.print(sayi + " Elemanlı Fibonacci Serisi : ");

        for ( i = 1; i <= sayi; i++){
            System.out.print(n1 + "  ");
            total = n1 + n2;
            n1 = n2;
            n2 = total;
        }
    }
}
