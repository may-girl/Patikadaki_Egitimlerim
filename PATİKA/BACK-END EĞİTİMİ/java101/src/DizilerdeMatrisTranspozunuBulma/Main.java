package DizilerdeMatrisTranspozunuBulma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int sutunSayisi = scanner.nextInt();

        int[][] matris = new int[satirSayisi][sutunSayisi];

        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        int[][] transpoz = new int[sutunSayisi][satirSayisi];

        // Transpozunu alma
        for (int i = 0; i < sutunSayisi; i++) {
            for (int j = 0; j < satirSayisi; j++) {
                transpoz[i][j] = matris[j][i];
            }
        }

        System.out.println("Transpoze:");
        for (int i = 0; i < sutunSayisi; i++) {
            for (int j = 0; j < satirSayisi; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
