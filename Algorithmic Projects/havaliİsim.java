package AlgoritmaTekrar;

import java.util.Scanner;

public class havaliİsim {
    public static void main(String[] args) {
        Scanner tara =new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String ad=tara.nextLine();

        int aduzunluk=ad.length();
        while (aduzunluk%12!=0){
            ad=ad+"*";
            aduzunluk=ad.length();
        }

        int parcauzunluk=aduzunluk/4;
        int bosluksayisi= parcauzunluk-2;
        String adbosluk="";
        while (adbosluk.length()<bosluksayisi){
            adbosluk=adbosluk+" ";
        }
        String adparca1=ad.substring(0,parcauzunluk);
        String adparca2=ad.substring(parcauzunluk,2*parcauzunluk);
        String adparca3=ad.substring(2*parcauzunluk,3*parcauzunluk);
        String adparca4=ad.substring(3*parcauzunluk,4*parcauzunluk);
        System.out.println(adparca1);
        int i=0;
        while (i<parcauzunluk){
            int j=parcauzunluk-1-i;
            System.out.println(adparca2.substring(i,i+1)+adbosluk+adparca4.substring(j,j+1));
            i=i+1;
        }
        System.out.println(adparca3);


    }
}
