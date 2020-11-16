package TvSimilasyonu;

import java.util.ArrayList;

public class Televizyon {
    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean acik;
    private int ses;
    private int aktifKanal;


    public Televizyon(String marka, String boyut) {
        this.marka = marka;
        aktifKanal=1;
        this.boyut = boyut;
        kanallar=new ArrayList<>();
        ses=10;
        kanallariOlustur();
        this.acik=false;
    }
    public void sesArttir(){
        if (ses <= 20 && acik==true) {
            ses++;
            System.out.println("Ses seviyesi: "+ses);
        }else System.out.println("Ses seviyesi maksimumda veya TV kapalı.");
    }
    public void sesAzalt(){
        if (ses >0&& acik) {
            ses--;
            System.out.println("Ses seviyesi: "+ses);
        }else System.out.println("Ses seviyesi minimumda veya TV kapalı.");
    }

    public void tvAc(){
        if (acik == false) {
            acik=true;
            System.out.println("TV açıldı.");
        } else System.out.println("TV zaten açık.");
    }

    public void tvKapat(){
        if (acik == true) {
            acik=false;
            System.out.println("TV Kapatıldı.");
        } else System.out.println("TV zaten kapalı.");
    }
    private void kanallariOlustur() {
        HaberKanali cnn=new HaberKanali(" CNN TV ",1," Genel Haber ");
        kanallar.add(cnn);
        HaberKanali sporizm=new HaberKanali(" Spor Bülteni TV ",2," Genel Spor ");
        kanallar.add(sporizm);
        HaberKanali fox=new HaberKanali(" FOX TV ",3," Genel Haber ");
        kanallar.add(fox);
        HaberKanali popTürk=new HaberKanali(" Pop Türk TV ",4," Genel Müzik ");
        kanallar.add(popTürk);
    }
    public void aktifKanaliGoster(){
        if (acik) System.out.println("Aktif Kanal: "+kanallar.get(aktifKanal-1).kanalBilgisiniGoster());

        else System.out.println("Önce televizyonu açınız.");
    }

    public void kanalDegistir(int acilmasiIstenenKanal){
        if (acik) {
            if (acilmasiIstenenKanal != aktifKanal) {
                if (acilmasiIstenenKanal <= kanallar.size() && acilmasiIstenenKanal>=0) {
                        aktifKanal=acilmasiIstenenKanal;
                    System.out.println("Kanal : "+acilmasiIstenenKanal+" Bilgiler= "+kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
                }else System.out.println("Geçerli bir kanal numarası giriniz.");
            }else System.out.println("Zaten "+aktifKanal+ ". kanaldasınız.");
        }else System.out.println("Önce televizyonu açınız.");

    }
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "Marka: "+marka+" Boyut: "+boyut+" olan TV oluşturuldu.";
    }
}
