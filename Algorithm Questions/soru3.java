package algoritmaTest;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi=tara.nextInt();
        String[] birlerr={"","","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
        String[] onlarr={"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};
        int binler,yuzler,onlar,birler;
        birler=sayi%10;
        sayi=sayi/10;
        onlar=sayi%10;
        sayi=sayi/10;
        yuzler=sayi%10;
        sayi=sayi/10;
        binler=sayi%10;

        String sonuc="";
        if (yuzler!=0)
            sonuc+=birlerr[binler]+""+"bin"+birlerr[yuzler]+""+"yüz"+onlarr[onlar]+""+birlerr[birler];
        else
            sonuc+=birlerr[binler]+""+"bin"+onlarr[onlar]+""+birlerr[birler];

        if (binler==1)
            sonuc+="bir";
        System.out.println(sonuc);
    }
}
