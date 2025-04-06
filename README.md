Java Film Bilet Satış Sistemi 
Bu proje, Java programlama dili kullanılarak geliştirilen konsol tabanlı bir Film Bilet Satış Sistemi uygulamasıdır.
Uygulama kullanıcıya film ve müşteri ekleme, film listesi görüntüleme, bilet satın alma ve alınan biletleri listeleme gibi temel işlevleri sunmaktadır.

------Kullanılan Sınıflar ve Yapılar------

Scanner: Kullanıcıdan konsol üzerinden veri almak için kullanılmıştır.

Diziler (Arrays): Film, müşteri ve bilet bilgilerini tutmak için sabit uzunlukta diziler kullanılmıştır.

Metotlar (Methods):

film_ekle() : Yeni bir film kaydı yapar.

musteri_ekle() : Yeni bir müşteri kaydı yapar.

film_listesi() : Eklenen filmleri listeler.

musteri_listesi() : Eklenen müşterileri listeler.

bilet_satın_al() : Seçilen müşteri için bilet satın alma işlemi yapar.

BiletListe() : Müşterilerin aldıkları biletleri listeler.

Ana Menü Yapısı (Switch-Case Döngüsü):
Kullanıcının yapmak istediği işlemi seçebilmesi için döngü ve seçim yapısı kullanılmıştır.

------Program Akışı------

Program başlatıldığında kullanıcıya bir ana menü sunulur.

Kullanıcı menüdeki işlemlerden birini seçer:

Film listesine bakma

Bilet satın alma

Müşteri listesi görüntüleme

Film ekleme

Müşteri ekleme

Alınan biletleri listeleme

Programdan çıkış yapma

Seçilen işlem ilgili metodun çalıştırılmasıyla gerçekleştirilir.

Veriler uygulama çalıştığı sürece RAM'de saklanır, dosyaya kaydetme işlemi yapılmaz.

------Geliştirme Ortamı------

Bu proje, IntelliJ IDEA geliştirme ortamı (IDE) kullanılarak hazırlanmıştır.
Projede, IntelliJ IDEA içerisinde yer alan yerleşik Simülasyon Java JDK (embedded SDK) kullanılmıştır.
Harici bir JDK kurulumu yapılmadan, IDE'nin sağladığı Java çalışma ortamı üzerinden geliştirme gerçekleştirilmiştir.
