import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static String[] film_isim = new String[10];
    static String[] film_turu = new String[10];
    static int[] film_suresi = new int[10];
    static int mevcut_film_sayisi = 0;

    static String[] musteri_isim = new String[20];
    static String[] musteri_soyad = new String[20];
    static String[] musteri_email = new String[20];
    static int mevcut_musteri_sayisi = 0;

    static int[][] alınan_biletler = new int[15][10];

    static void bilet_satın_al() {
        if (mevcut_film_sayisi == 0 || mevcut_musteri_sayisi == 0) {
            System.out.println("Film Yada Müşteri Girişi Eksik, Lütfen Film Yada Müşteri Girişi Yapın.");
            return;
        }

        System.out.println("Vizyondaki Filmler");
        for (int i = 0; i < mevcut_film_sayisi; i++) {
            System.out.println(i + 1  + ". İsim: "+ film_isim[i] + " Tür:"+ film_turu[i] + " Süre: "+ film_suresi[i]);
        }

        System.out.print("\nLütfen Gideceğiniz Filmi Seçiniz. " +  "(1-" + mevcut_film_sayisi + ")");
        int secilen_film = sc.nextInt() - 1;
        sc.nextLine();

        if (secilen_film < 0 || secilen_film >= mevcut_film_sayisi) {
            System.out.println("\nYanlış Seçim Yaptınız. Lütfen Tekrar Deneyin.");
            return;
        }

        System.out.println("Müşteri Listesi:");
        for (int i = 0; i < mevcut_musteri_sayisi; i++) {
            System.out.println(i + 1 + ". " + musteri_isim[i] + " " + musteri_soyad[i] +" (E-Posta: " + musteri_email[i] + ")");
        }

        System.out.print("\nLütfen Müşteri Numarasını Seçin. " +  "(1-" + mevcut_musteri_sayisi + ")");
        int secilen_musteri = sc.nextInt() - 1;
        sc.nextLine();

        if (secilen_musteri < 0 || secilen_musteri >= mevcut_musteri_sayisi) {
            System.out.println("\nYanlış Seçim Yaptınız. Lütfen Tekrar Deneyin.");
            return;
        }

        alınan_biletler[secilen_musteri][secilen_film] = 1;
        System.out.println("\nBilet Başarıyla Oluşturuldu. İyi Eğlenceler!");
    }

    static void BiletListe() {
        System.out.println("---Bilet-Liste---");

        for (int i = 0; i < mevcut_musteri_sayisi; i++) {
            System.out.println("İsim Soyisim:" + musteri_isim[i] + " " + musteri_soyad[i] + " (E-Posta: " + musteri_email[i] + ")");
            boolean biletBulundu = false;

            for (int j = 0; j < mevcut_film_sayisi; j++) {
                if (alınan_biletler[i][j] == 1) {
                    System.out.print(film_isim[j] + "\n ");
                    biletBulundu = true;
                }
            }

            if (!biletBulundu) {
                System.out.print("Mevcut Değil\n");
            }

        }
        System.out.println("\nAna menüye dönmek için 'Enter' tuşuna basın.");
        sc.nextLine();
    }

    static void musteri_ekle() {
        if (mevcut_musteri_sayisi < 20) {

            System.out.println("Müşteri Adını Girin: ");
            musteri_isim[mevcut_musteri_sayisi] = sc.nextLine();

            System.out.println("Müşteri Soyadını Girin: ");
            musteri_soyad[mevcut_musteri_sayisi] = sc.nextLine();

            System.out.println("Müşteri Email'ini Girin: ");
            musteri_email[mevcut_musteri_sayisi] = sc.nextLine();

            mevcut_musteri_sayisi++;
            System.out.println("Müşteri Sisteme Kaydedildi.");

        }
        else {
            System.out.println("Maksimum 20 Müşteri Eklenebilir.");
        }
    }

    static void musteri_listesi() {
        if (mevcut_musteri_sayisi > 0) {
            for (int i = 0; i < mevcut_musteri_sayisi; i++) {
                System.out.println("Ad: " + musteri_isim[i]);
                System.out.println("Soyad: " + musteri_soyad[i]);
                System.out.println("Eposta: " + musteri_email[i]);
            }
        }
        else {
            System.out.println("Sistemde Müşteri Kaydı Bulunmamaktadır.");
        }
    }

    static void film_listesi() {
        if (mevcut_film_sayisi > 0) {
            for (int i = 0; i < mevcut_film_sayisi; i++) {
                System.out.println("Film Adı: " + film_isim[i]);
                System.out.println("Film Türü: " + film_turu[i]);
                System.out.print("Film Süresi: " + film_suresi[i] + " Dakika\n");
            }
        }
        else {
            System.out.println("Vizyonda Herhangi Bir Film Yok.");
        }
    }


    static void film_ekle() {
        if (mevcut_film_sayisi < 10) {
            System.out.println("Film Adını Girin: ");
            film_isim[mevcut_film_sayisi] = sc.nextLine();


            System.out.println("Filmin Türünü Girin: ");
            film_turu[mevcut_film_sayisi] = sc.nextLine();


            System.out.println("Filmin Süresini Girin: ");
            film_suresi[mevcut_film_sayisi] = sc.nextInt();
            sc.nextLine();  // enter tuşunu temizledik.


            mevcut_film_sayisi++;
            System.out.println("Film Eklendi.");

        }
        else {
            System.out.println("Maksimum 10 Film Eklenebilir.");
        }
    }

    public static void main(String[] args) {
            int secim;

            do {
                System.out.println("1-) Film Listesi");
                System.out.println("2-) Bilet Satın Al");
                System.out.println("3-) Müşteri Listesi");
                System.out.println("4-) Film Ekle");
                System.out.println("5-) Müşteri Ekle");
                System.out.println("6-) Alınan Biletler");
                System.out.println("7-) Çıkış");
                secim = sc.nextInt();
                sc.nextLine();

                switch (secim){
                    case 1:
                        film_listesi();
                        break;
                    case 2:
                        bilet_satın_al();
                        break;
                    case 3:
                        musteri_listesi();
                        break;
                    case 4:
                        film_ekle();
                        break;
                    case 5:
                        musteri_ekle();
                        break;
                    case 6:
                        BiletListe();
                        break;
                    case 7:
                        System.out.println("Sistemden Çıkış Yapılıyor...");
                        break;
                    default:
                        System.out.println("Geçersiz seçim. Lütfen tekradan deneyiniz.");
                }

            } while (secim!= 7);
    }
}
