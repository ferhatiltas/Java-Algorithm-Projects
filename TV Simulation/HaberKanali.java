package TvSimilasyonu;

public class HaberKanali extends  Kanal {
        private String haberTuru;
    public HaberKanali(String adi, int kanalNo,String tur) {
        super(adi, kanalNo);
        this.haberTuru=tur;
    }
}
