package polindromSayisi;

import java.util.Scanner;

public class polindromSayisi {
    static boolean isPolindrom(int number){

        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber) {
            System.out.println(number + " Polindrom Sayısıdır");
            return true;
        }else {
            System.out.println(number + " Polindrom Sayısı Değildir.");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();

        System.out.println(isPolindrom(number));

    }
}
