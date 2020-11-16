package TvSimilasyonu;

import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class Similasyon {
  static   Scanner tara=new Scanner(System.in);
  static Televizyon tv;
    public static void main(String[] args) {
        menuGoster();
        boolean cikis=false;
        while (cikis==false){
            System.out.println("Seçiminiz: (Menüyü görmek için 8'i tuşlayınız.)");
            int secim=tara.nextInt();
            switch (secim){
                case 1: tvKurVeKanallariGoster();break;
                case 2:tvAc(); break;
                case 3: sesArttir();break;
                case 4: sesAzalt(); break;
                case 5: kanalDegistir();
                case 6: kanalBilgisiniGoster(); break;
                case 7:tvKapat(); break;
                case 8: menuGoster();break;
                case 0: System.out.println("Sistemden çıkılıyor.");cikis=true; break;
                default: System.out.println("0 ile 8 arasında bir değer giriniz.");break;
            }
        }
    }

    private static void kanalBilgisiniGoster() {
        if (tv != null) {
            tv.aktifKanaliGoster();
        } else  System.out.println("Önce TV'yi kurup kanalları oluşturunuz.");
    }

    private static void kanalDegistir() {
        tara.nextLine();
        if (tv != null) {
            System.out.println("Hangi kanalı izlemek istiyorsunuz?\n");
            int acilmasiIstenenKanal=tara.nextInt();
            tv.kanalDegistir(acilmasiIstenenKanal);
        } else  System.out.println("Önce TV'yi kurup kanalları oluşturunuz.");

    }

    private static void sesArttir() {
        if (tv != null) {
            tv.sesArttir();
        } else System.out.println("Önce TV'yi kurup  kanalları oluşturunuz.");
    }
    private static void sesAzalt() {
        if (tv != null) {
            tv.sesAzalt();
        } else System.out.println("Önce TV'yi kurup kanalları oluşturunuz.");
    }

    private static void tvKapat() {
        if (tv != null) {
            tv.tvKapat();
        } else System.out.println("Önce TV'yi kurup kanalları oluşturunuz.");
    }


    private static void tvAc() {
        if (tv != null) {
            tv.tvAc();
        } else System.out.println("Önce TV'yi kurup kanalları oluşturunuz.");
    }

    private static void tvKurVeKanallariGoster() {

        if (tv == null) {
            tara.nextLine();
            System.out.println("Televizyon markasını giriniz.");
            String marka=tara.nextLine();
            System.out.println("Televizyon boyutunu giriniz.");
            String boyut=tara.nextLine();
            tv=new Televizyon(marka,boyut);
            System.out.println(tv);
        }
        else System.out.println(tv);


    }

    private static void menuGoster() { //İlk başta menümüzü gösterelim.
        System.out.println("********************MENÜ***********************");
        System.out.println("0 -- Çıkış\n"+
                "1 -- Televizyonu Kur\n"+
                "2 -- Televizyonu Aç\n"+
                "3 -- Sesini Arttır\n"+
                "4 -- Sesini Azalt\n"+
                "5 -- Kanal Değiştir\n"+
                "6 -- Kanal Bilgisini Göster\n"+
                "7 -- Televizyonu Kapat\n"+
                "8 -- Menüyü Göster\n");
    }
}
