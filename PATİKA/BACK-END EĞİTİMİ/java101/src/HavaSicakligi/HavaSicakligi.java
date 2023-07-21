package HavaSicakligi;

import java.util.Scanner;

public class HavaSicakligi {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int heat;

        System.out.print("Hava sıcaklığı kaç derece : ");
        heat = inp.nextInt();

        if (heat < 5) {

        } else if (heat >= 5 && heat < 10) {
            System.out.print("Sinemaya gidebilirsiniz");
        } else if (heat >= 10 && heat <= 15) {
            System.out.print("Hem sinemaya hem de pikniğe gidebilirsiniz");
        } else if (heat > 15 && heat <= 25) {
            System.out.print("Pikniğe gidebilirsiniz");
        } else {
            System.out.print("Yüzmeye gidebilirsiniz");
        }
    }
}
