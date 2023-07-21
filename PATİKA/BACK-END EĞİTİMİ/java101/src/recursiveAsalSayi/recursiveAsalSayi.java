package recursiveAsalSayi;

import java.util.Scanner;

public class recursiveAsalSayi {
    static boolean asalMi(int n, int i){

        if(n==0 || n==1){
            return false;
        }

        if(n==2){
            return true;
        }
        else{

            if(n%i==0){

                if(i==1){

                    return asalMi(n,i+1);

                }else if(n==i){

                    return true;

                }else{

                    return false;
                }
            } else{

                return asalMi(n,i+1);
            }
        }
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n;
        System.out.print(" Bir Sayı Giriniz : ");
        n=inp.nextInt();

        if(asalMi(n,1)){

            System.out.println(n + " Bir Asal Sayıdır. ");

        }else {

            System.out.println(n + " Asal Sayı Değildir. ");
        }
    }
}

