package AlgoritmaTekrar;

import java.util.Scanner;

public class SeriHesabı {
    public static void main(String[] args) {
        Scanner tara =new Scanner(System.in);
        System.out.println("Lütfen seride hesaplanacak x değerinni giriniz");
        int x=tara.nextInt();
        System.out.println("Seride hesaplanacak terim sayısını giriniz");
        int n =tara.nextInt();
        int i=1;
        int deger=2;
        while (i<=n){
            System.out.print("("+deger+"!/("+x+"^"+deger+"))");
            if (i!=n){
                if (i%2==0){
                    System.out.print("+");
                }
                else {
                    System.out.print("-");
                }

            }
            else System.out.print("=");
            deger=deger+3;
            i++;
        }
        System.out.print(Hesapla(x,n));


    }
    public static double Hesapla(int deger,int terimSayisi){
        double sonuc=0.0;
        int artis=2;
        int i=1;
        while (i<=terimSayisi){
            double q=Faktoriyel(artis)/UstAl(deger,artis);
            if (i%2==0)
                sonuc=sonuc-q;
            else
                sonuc=sonuc+q;

            i++;
            artis=artis+3;
        }
        return sonuc;
    }
    public static int Faktoriyel(int n){
        int sonuc=1;
        for (int i=1;i<=n;i++){
            sonuc=sonuc*i;

        }
        return sonuc;
    }
    public static int UstAl(int a,int b){
        int donuc=1;
        int i=1;
        while (i<=b){
            donuc=donuc*a;
            i++;
        }
        return donuc;
    }
}
