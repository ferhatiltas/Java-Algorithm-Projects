package algoritmaTest;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz.");
        String metin=tara.nextLine();
        System.out.println("Lütfen parçalamk için özel karakter giriniz.");
        String karakter= tara.nextLine();
        String[] cikti= parcala(metin,karakter);
        int i=0;
        while (i<cikti.length){
            System.out.println(cikti[i]);
            i++;
        }
        String[] cikti2=metin.split(karakter);
        int j=0;
        while (j<cikti2.length){
            System.out.println(cikti2[j]);
            j++;
        }
    }
    public static String[] parcala(String veri, String karakterler) {
        char k=karakterler.charAt(0);
        int sayac=0;
        int i=0;
        while (i<veri.length()){
            if (veri.charAt(i)==k){
                sayac++;
            }
            i++;
        }
        String[] sonuclar=new String[sayac+1];
        int alt=0;
        int adet=0;
        int j=0;
        while (j<veri.length()){
            if (veri.charAt(j)==k)
            {
                sonuclar[adet]=veri.substring(alt,j);
                adet++;
                alt=j+1;
            }
            j++;
        }
        sonuclar[sayac]=veri.substring(alt);
        return sonuclar;
    }
}
