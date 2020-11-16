package AlgoritmaTekrar;

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("Oyunun satır boyutunu giriniz");
        int a=tara.nextInt();
        System.out.println("oyunun sutun boyutunu giriniz");
        int b=tara.nextInt();
        int[][] oyunmatris=HaritaDoldur(a,b);
        int puan=0;
        boolean kontrol=true;
        while (kontrol){
            System.out.println("seçtiğiniz konumun satir değrini giriniz.");
            int x=tara.nextInt();
            System.out.println("seçtiğiniz konumun sutun değerini giriniz");
            int y=tara.nextInt();
            if (oyunmatris[x][y]==1){
                kontrol=false;
            }
            else {
                puan=puan+10;
                System.out.println("Hala hayattasın... devam et");
            }
        }
        System.out.println("oyun bitti puanınız:"+puan);
    }
    public static int[][] HaritaDoldur(int satir, int sutun){
        Random rnd =new Random();
        int[][] matris=new int[satir][sutun];
        int i=0;
        while (i<satir){
            int j=0;
            while (j<sutun){
                matris[i][j]=rnd.nextInt(2);
                j++;
            }
            i++;
        }
        return matris;
    }
}
