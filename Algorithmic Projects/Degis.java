package AlgoritmaTekrar;

public class Degis {
    public static void main(String[] args) {
        int[] veri={7,25,36,5,868,61,21,56,25};
        System.out.println("DEğiştirelen eleman:"+Degistir(veri,4));
    }

    private static int Degistir(int[] dizi, int pozisyon) {
        int sonuc=dizi[pozisyon];
        dizi[pozisyon]=-1;
        return sonuc;
    }
}
