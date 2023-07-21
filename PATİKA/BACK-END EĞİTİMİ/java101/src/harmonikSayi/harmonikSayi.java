package harmonikSayi;

import java.util.Scanner;

public class harmonikSayi {

    public static void main(String[] args) {

        double result = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen N sayısını girin : ");
        int n = input.nextInt();

        for (double i = 1; i <= n; i ++){
            result += (1/i);
        }
        System.out.println("Harmonik sayi : " + result);
    }
}
