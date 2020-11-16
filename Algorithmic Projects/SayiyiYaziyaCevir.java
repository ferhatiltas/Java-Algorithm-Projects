package AlgoritmaTekrar;

import java.util.Scanner;

public class SayiyiYaziyaCevir {
    public static void main(String[] args) {
        String []dizi1={"","","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
        String[] dizi2={"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};
        Scanner tara=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=tara.nextInt();
        int binler,yuzler,onlar,birler;
        birler=sayi%10;
        sayi=sayi/10;
        onlar=sayi%10;
        sayi=sayi/10;
        yuzler=sayi%10;
        sayi=sayi/10;
        binler=sayi%10;
        String sonuc="";
        if (yuzler!=0){
            sonuc+=dizi1[binler]+" "+"bin "+dizi1[yuzler]+" "+ " yüz "+dizi2[onlar]+" "+dizi1[birler];
        }
        else  sonuc+=dizi1[binler]+" "+"bin "+ dizi2[onlar]+ " "+ dizi1[birler];
        if (birler==1) sonuc+="bir";
        System.out.println(sonuc);
    }
}
