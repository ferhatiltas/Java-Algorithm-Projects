package algoritmaTest;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz.");
        String metin=tara.nextLine();
        System.out.println("Lütfen seçilen parçanın alt aralık değerini giriniz.");
        int alt=tara.nextInt();
        System.out.println("lütfen seçilen parçanın üst aralık değerini giriniz");
        int ust =tara.nextInt();
        System.out.println("seçilen alt parça \n"+altparca(metin,alt,ust));
        System.out.println();
        System.out.println(metin.substring(alt,ust));

    }

    private static String altparca(String veri, int x, int y) {
        String sonuc="";
        if (y==-1){
            y=veri.length();
        }
        int i=x;
        while (i<y){
            sonuc=sonuc+veri.charAt(i);
            i++;
        }
        return sonuc;

    }
}