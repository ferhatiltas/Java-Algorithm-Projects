package algoritmaTest;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("Lütfen X değerini giriniz.");
        int x=tara.nextInt();
        System.out.println("Lütfen seride hesaplanacak terim sayısını giriniz.");
        int n=tara.nextInt();
        int i=1;
        int deger=2;
        while (i<=n) {
            System.out.println("(" + deger + "!" + "/(" + x + "^" + deger + "))");
            if (i != n) {
                if (i % 2 == 0) {
                    System.out.println("+");
                } else System.out.println("-");
            } else System.out.println("=");
            deger = deger + 3;
            i++;
        }
        System.out.println(Hesapla(x,n));
    }

    public static double Hesapla(int deger, int terimSayisi) {
        double sonuc=0.0;
        int artis=2;
        int i=1;
        while (i<=terimSayisi){
            double a=Fakoriyel(artis)/UstAl(deger,artis);
            if (i%2==0){
                sonuc =sonuc-a;
            }
            else sonuc=sonuc+a;
            i++;
            artis=artis+3;
        }
        return sonuc;
    }
    public static int UstAl(int a, int b) {
        int sonuc=1;
        int i=1;
        while (i<=b){
            sonuc =sonuc*a;
            i++;
        }
        return sonuc;
    }
    public static int Fakoriyel(int n) {
        int sonuc=1;
        for (int i=1;i<n;i++){
            sonuc=sonuc*i;
        }
        return sonuc;
    }
}


