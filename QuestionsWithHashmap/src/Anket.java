
import java.util.*;

public class Anket {
    public static void main(String[] args) {
        HashMap<Integer, String> sorular = new HashMap<Integer, String>();
        sorular.put(1, "Ekonomi sizin icin ne kadar onemli? ? 1 ile 10 Arasinda degerlendiriniz.");
        sorular.put(2, "Saglikli beslenme sizin icin ne kadar onemli ? 1 ile 10 Arasinda degerlendiriniz.");
        sorular.put(3, "Uzun yasamak sizin icin ne kadar onemli ? 1 ile 10 Arasinda degerlendiriniz.");
        sorular.put(4, "Universite okumak sizin icin ne kadar onemli ? 1 ile 10 Arasinda degerlendiriniz. ");
        sorular.put(5, "Aile kavrami sizin icin ne kadar onemli ? 1 ile 10 Arasinda degerlendiriniz.");
        int counter = 0;
        int kullanici = 1;
        int yanit1 = 0, yanit2 = 0, yanit3 = 0, yanit4 = 0, yanit5 = 0;
        HashMap<Integer, Integer> kullanici1Cevap = new HashMap<Integer, Integer>();
        kullanici1Cevap.put(1, 1);
        HashMap<Integer, Integer> kullanici2Cevap = new HashMap<Integer, Integer>();
        kullanici2Cevap.put(1, 1);
        HashMap<Integer, Integer> kullanici3Cevap = new HashMap<Integer, Integer>();
        kullanici3Cevap.put(1, 1);
        HashMap<Integer, Integer> kullanici4Cevap = new HashMap<Integer, Integer>();
        kullanici4Cevap.put(1, 1);
        HashMap<Integer, Integer> kullanici5Cevap = new HashMap<Integer, Integer>();
        kullanici5Cevap.put(1, 1);
        int kullanici1 = 1, kullanici2 = 1, kullanici3 = 1, kullanici4 = 1, kullanici5 = 1;


        Scanner yanit = new Scanner(System.in);

        while (counter != -1) {
            System.out.println(sorular.get(1));
            yanit1 = yanit.nextInt();
            kullanici1Cevap.put(kullanici1, yanit1);
            kullanici1++;
            System.out.println(sorular.get(2));
            yanit2 = yanit.nextInt();
            kullanici2Cevap.put(kullanici2, yanit2);
            kullanici2++;
            System.out.println(sorular.get(3));
            yanit3 = yanit.nextInt();
            kullanici3Cevap.put(kullanici3, yanit3);
            kullanici3++;
            System.out.println(sorular.get(4));
            yanit4 = yanit.nextInt();
            kullanici4Cevap.put(kullanici4, yanit4);
            kullanici4++;
            System.out.println(sorular.get(5));
            yanit5 = yanit.nextInt();
            kullanici5Cevap.put(kullanici5, yanit5);
            kullanici5++;

            System.out.println("Uygulamadan cikmak istiyorsaniz -1 e basiniz. Devam etmek isterseniz rastgele bir rakam tuslayabilirsiniz");
            counter = yanit.nextInt();
        }



        HashMap<Integer, Integer> ortalamalar = new HashMap<Integer, Integer>();
        ortalamalar.put(1, ortHesapla(kullanici1Cevap));
        ortalamalar.put(2, ortHesapla(kullanici2Cevap));
        ortalamalar.put(3, ortHesapla(kullanici3Cevap));
        ortalamalar.put(4, ortHesapla(kullanici4Cevap));
        ortalamalar.put(5, ortHesapla(kullanici5Cevap));


        System.out.print("Ekonomi ");
        degerlendirme(kullanici1Cevap);
        System.out.print(" Ortalama : " + ortalamalar.get(1));
        System.out.println("");
        System.out.print("Saglikli Beslenmek ");
        degerlendirme(kullanici2Cevap);
        System.out.print(" Ortalama : " + ortalamalar.get(2));
        System.out.println("");
        System.out.print("Uzun Yasamak ");
        degerlendirme(kullanici3Cevap);
        System.out.print(" Ortalama : " + ortalamalar.get(3));
        System.out.println("");
        System.out.print("Universite okumak ");
        degerlendirme(kullanici4Cevap);
        System.out.print(" Ortalama : " + ortalamalar.get(4));
        System.out.println("");
        System.out.print("Aile kavrami ");
        degerlendirme(kullanici5Cevap);
        System.out.print(" Ortalama : " + ortalamalar.get(5));
        System.out.println("");
        mostRated(ortalamalar);
        worstRated(ortalamalar);
        
    }


    public static int ortHesapla(HashMap<Integer, Integer> kullaniciCevaplari) {

        int sonuc = 0;
        int kullanicisayisi = 0;
        int toplam = 0;
        int temp;
        int ortalama = 0;
        kullanicisayisi = kullaniciCevaplari.size();
        for (int i = 1; i < (kullaniciCevaplari.size() + 1); i++) {
            temp = kullaniciCevaplari.get(i);
            toplam += temp;
        }
        ortalama = toplam / kullanicisayisi;
        return ortalama;


    }

    public static void degerlendirme(HashMap<Integer, Integer> kullaniciCevaplari) {

        HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();

        int temp1 = 0, temp2 = 0, temp3 = 0, temp4 = 0, temp5 = 0, temp6 = 0, temp7 = 0, temp8 = 0, temp9 = 0, temp10 = 0;
        for (int i = 1; i < (kullaniciCevaplari.size() + 1); i++) {
            if (kullaniciCevaplari.get(i) == 1) {
                temp1++;
            } else if (kullaniciCevaplari.get(i) == 2) {
                temp2++;
            } else if (kullaniciCevaplari.get((i)) == 3) {
                temp3++;
            } else if (kullaniciCevaplari.get((i)) == 4) {
                temp4++;
            } else if (kullaniciCevaplari.get((i)) == 5) {
                temp5++;
            } else if (kullaniciCevaplari.get((i)) == 6) {
                temp6++;
            } else if (kullaniciCevaplari.get((i)) == 7) {
                temp7++;
            } else if (kullaniciCevaplari.get((i)) == 8) {
                temp8++;
            } else if (kullaniciCevaplari.get((i)) == 9) {
                temp9++;
            } else {
                temp10++;
            }

        }
        counter.put(1, temp1);
        counter.put(2, temp2);
        counter.put(3, temp3);
        counter.put(4, temp4);
        counter.put(5, temp5);
        counter.put(6, temp6);
        counter.put(7, temp7);
        counter.put(8, temp8);
        counter.put(9, temp9);
        counter.put(10, temp10);
        System.out.println(counter.entrySet());


    }

    public static void mostRated(HashMap<Integer, Integer> ortalamalar) {
        int temp = ortalamalar.get(1);
        int enBuyuk = 0;
        HashMap<Integer, Integer> soru = new HashMap<Integer, Integer>();

        for (int i = 1; i < (ortalamalar.size() + 1); i++) {
            if (temp <= ortalamalar.get(i)) {
                temp = ortalamalar.get(i);
                enBuyuk = temp;

            }
        }
        for (int i = 1; i < (ortalamalar.size() + 1); i++) {
            if (enBuyuk == ortalamalar.get(i)) {
                soru.put(i, enBuyuk);
            }
        }
        System.out.println("En yuksek ortalamaya sahip soru : " + soru.entrySet());
    }

    public static void worstRated(HashMap<Integer, Integer> ortalamalar) {
        int temp = ortalamalar.get(1);
        int enkucuk = 0;
        HashMap<Integer, Integer> soru = new HashMap<Integer, Integer>();
        for (int i = 1; i < (ortalamalar.size() + 1); i++) {
            if (temp >= ortalamalar.get(i)) {
                temp = ortalamalar.get(i);
                enkucuk = temp;
            }
        }
        for (int i = 1; i < (ortalamalar.size() + 1); i++) {
            if (enkucuk == ortalamalar.get(i)) {
                soru.put(i, enkucuk);
            }
        }
        System.out.println("En kucuk ortalamaya sahip soru : " + soru.entrySet());
    }
}
