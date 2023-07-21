package mukemmelSayi;

import java.util.Scanner;

public class mukemmelSayi {

    public static void main(String[] args) {

        int total=0, sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        sayi = input.nextInt();

        for (int i = 1; i < sayi; i++){
            if(sayi % i == 0){
                total = total + i;
            }
        }
        if (total == sayi){
            System.out.println("Mükemmel Sayıdır.");
        }else{
            System.out.println("Mükemmel Sayı Değil.");
        }
    }
}
