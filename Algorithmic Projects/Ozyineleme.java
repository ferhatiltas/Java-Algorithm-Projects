package AlgoritmaTekrar;

import java.util.Scanner;


public class Ozyineleme {
    public static void main(String[] args) {
        Scanner tara =new Scanner(System.in);
        System.out.println("Lütfen bir değer giriniz.");
        int deger=tara.nextInt();
        System.out.println("1'den "+deger+"'e kadar olan sayıların toplamı: "+Toplambul1(deger));
        System.out.println("1'den "+deger+"'e kadar olan sayıların ÖzYenilemeli toplamı: "+Toplambul2(deger));
        System.out.println("");
        System.out.println(deger+"! sonucu: "+Faktoriyel1(deger));
        System.out.println(deger+"! ÖzYenilemeli sonucu: "+Faktoriyel2(deger));
        System.out.println("");
        System.out.println(deger+"Fibonachi sayısı: "+Fibonachi1(deger));
        System.out.println(deger+"Fibonachi sayısının ÖzYenilemeli değer: "+Fibonachi2(deger));
        System.out.println("");
        System.out.println("Lütfen taban değerini giiriniz");
        int taban=tara.nextInt();
        System.out.println("Lütfen üs değerini giriniz");
        int us=tara.nextInt();
        System.out.println(taban+"^"+us+"değerinin sonucu: "+UstAl1(taban,us));
        System.out.println(taban+"^"+us+" değerinin ÖzYenilemeli sonucu: "+UstAl2(taban,us));
    }
    private static int UstAl2(int x, int y) {
        if (y==0) return 1;
        else return x*UstAl2(x,y-1);
    }
    private static int UstAl1(int x, int y) {
        int sonuc=1;
        int i=1;
        while (i<=y){
            sonuc=sonuc*x;
            i++;
        }
        return sonuc;
    }
    private static int Fibonachi2(int n) {
        int sonuc=1;
        if (n==1 || n==2){
            return sonuc;
        }
        else return Fibonachi2(n-1)+Fibonachi2(n-2);
    }
    private static int Fibonachi1(int n) {
        int sonuc=1;
        if (n==1 || n==2){
            return sonuc;
        }
        else {
            int sayi1=1;
            int sayi2=1;
            int i=3;
            while(i<=n) {
                sonuc = sayi1 + sayi2;
                sayi1 = sayi2;
                sayi2=sonuc;
                i++;
            }
        }
        return sonuc;
    }
    private static int Faktoriyel2(int n) {
        if (n==0)
        return 1;
        else return n*Faktoriyel2(n-1);
    }
    private static int Faktoriyel1(int n) {
        int i=1;
        int sonuc=1;
        while(i<=n){
            sonuc=sonuc*i;
            i++;
        }
        return sonuc;
    }
    private static int Toplambul2(int n) {
        if (n==1) return 1;
        else
        return n +Toplambul2(n-1);
    }
    private static int Toplambul1(int n) {
        int sonuc=0;
        int i=1;
        while (i<=n){
            sonuc=sonuc+i;
            i++;
        }
    return sonuc;
    }

}
