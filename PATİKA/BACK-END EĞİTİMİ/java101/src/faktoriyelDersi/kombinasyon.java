package faktoriyelDersi;

import  java.util.Scanner;

public class kombinasyon {

    public static void main(String[] args) {

        int n,r,ntotal=1,rtotal=1,nrtotal=1,result=1;

        Scanner input= new Scanner(System.in);
        System.out.println("Kombinasyon hesabınız C(n,r) şeklinde hesaplanacaktır !");

        System.out.print("Birinci sayıyı(n) giriniz: ");
        n=input.nextInt();

        System.out.print("ikinci sayıyı (r) giriniz: ");
        r=input.nextInt();

        for(int i=1;i<=n;i++){
            ntotal=ntotal*i;
        }

        for(int i=1;i<=r;i++){
            rtotal=rtotal*i;
        }

        for(int i=1;i<=(n-r);i++){
            nrtotal=nrtotal*i;
        }

        result=ntotal/(rtotal*nrtotal);

        System.out.println("C(n,r) = n! / ( r! * (n-r)! ): \nİşlemin Sonucu: " + result);

    }
}
