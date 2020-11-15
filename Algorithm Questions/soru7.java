package algoritmaTest;

import java.util.Scanner;

public class dfg {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi=tara.nextInt();
        String[] a={"","","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
        String[] b={"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};
        int bin,yuz,on,bir;
        bir=sayi%10;
        sayi=sayi/10;
        on=sayi%10;
        sayi=sayi/10;
yuz=sayi%10;
        sayi=sayi/10;

        bin=sayi%10;
        String sonuc="";
        if (yuz!=0){
            sonuc+=a[bin]+"bin"+a[yuz]+""+"yüz"+b[on]+""+a[bir];

        }
        else
            sonuc+=a[bin]+""+"bin"+b[on]+""+a[bir];
if (bin==1)
    sonuc+="bir";
        System.out.println(sonuc);
    }
}
