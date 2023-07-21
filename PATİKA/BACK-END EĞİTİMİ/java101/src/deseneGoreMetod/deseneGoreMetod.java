package deseneGoreMetod;

import java.util.Scanner;

public class deseneGoreMetod {

    static void desenAzalan(int n, int n_) {
        if (n > 0) {
            System.out.print(n + " ");
            n -= 5;
            desenAzalan(n, n_);
        } else {
            desenArtan(n, n_);
        }
    }

    static void desenArtan(int n, int n_) {
        if (n <= n_) {
            System.out.print(n + " ");
            n += 5;
            desenArtan(n, n_);
        }
    }

    public static void main(String[] args) {
        int n, n_;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        n = input.nextInt();
        n_ = n;
        desenAzalan(n, n_);

    }

}