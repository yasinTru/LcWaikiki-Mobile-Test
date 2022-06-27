# LcWaikiki Test Case
## Lc Waikiki Mobil Uygulama Proje Ödevine ait çalışma.

Cucumber/Java ve Appium kullanılarak BDD yaklaşımıyla Lc Waikiki mobil uygulamasının uçtan uca test edilmesini içeren proje.
_______

## Projenin İsterleri:



- Bir yeni müşteri kaydı oluşturulacak.
- Login olduktan sonra;  Kategoriler ---Kadın---Giyim---bluz bölümüne girip,
- Filtreleme bölümünden renk seçeneği **siyah** seçilecek.
- Sonuçlar listele yapılıp ,gelen ürün sonuçlarından biri seçilip ,üstüne tıklanacak.
- Beden medium seçilecek, sepete ekle butonuna tıklanacak.
- Sepetime gidilecek ,ürünün adı ,adeti ,bedeni kontrol edilecek.
- Ödeme yap butonuna tıklayıp, ödeme ekranına gidildiği, doğru ekrana yönlendirildiği kontrol edilecek.

## Projenin Dosya Yapısı


Proje dosya yapısına ait ekran görüntüsü:

![projeDosyası](https://github.com/yasinTru/LcWaikiki-Mobile-Test/blob/master/src/main/resources/mobileSS/projectFolder.PNG)


### Projenin;
-----------



> src/main/java/Framework 

konumunda kod yapısına ait yardımcı sınıflar mevcut bulunmaktadır. Bu sınıflar driverı ayağa kaldırma, kod içinde yardımcı elementlerin tanımlanması, hookların tanımlanmasını içermektedir.

--------

>src/test/java

konumunda Feature dosyaları, Runner sınıfı, Projeye ait sayfalar ve bu sayfalara ait Step Definiton sınıfları bulunmakta. 

Runner sınıfının kod yapısı:

![Runner](https://github.com/yasinTru/LcWaikiki-Mobile-Test/blob/master/src/main/resources/mobileSS/TestRunner.PNG)

---------

>src/test/resources 

konumunda ise projenin koşmasını/çalışmasını sağlayan Test Suite dosyası ve projenin temel kuralllarını sağlayan config.properties bulunmakta.

Parallel.xml ekran görüntüsü:

![suiteSs](https://github.com/yasinTru/LcWaikiki-Mobile-Test/blob/master/src/main/resources/mobileSS/TestSuiteXML.PNG)

__Proje; Test Suites/Parallel.xml dosyasının çalıştırılması ile test işlemlerine başlamaktadır.__





---------------

## Projede Kullanılan Teknolojiler:

- Java
- Appium
- Android Studio
- Webdriver
- İntellij Idea
- Allure
- Cucumber
- Driver ve Raporlama kütüphaneleri

---------
## Test Raporları

Projede Allure kütüphanesi ve Cucumber reports yardımı ile raporlama işlemleri gerçekleştirildi.





Allure Suite çıktısı: 

![AllureOverview](https://github.com/yasinTru/LcWaikiki-Mobile-Test/blob/master/src/main/resources/mobileSS/AllureReport.PNG)

-------------

Cucumber End to end testinin Rapor çıktıları:

![cucumberEnd2end](https://github.com/yasinTru/LcWaikiki-Mobile-Test/blob/master/src/main/resources/mobileSS/CucumberReport.PNG)


