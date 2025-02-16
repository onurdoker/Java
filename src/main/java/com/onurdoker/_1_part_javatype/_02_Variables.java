package com.onurdoker._1_part_javatype;

public class _02_Variables {

    public static void main(String[] args) {

        // Veri değişken isimlerini yazarken;

    /*
    Veri isimlendirmeleri:
        1. isim veya sıfat, zamir kullanmamız lazım.
        Anlamlı ve açıklayıcı isimler seçiniz.
        2. _ veya $ ile başlayabilir.
        3. _ veya $ dışında özel karakter kullanılamaz.
        4. sayı ile bitebilir.
        5. sayı ile başlayamaz.
        6. değişken isimleri camelCase kuralına göre yazılır.
    */
        int studentCounter = 10;
        float totalSalary = 14.5355f;
        int schoolNumber = 25;
        System.out.println("schoolNumber: " + schoolNumber);
        schoolNumber = 44;
        System.out.println(schoolNumber);

        int _schoolNumber = 55;
        System.out.println("_schoolNumber: " + _schoolNumber);

        int $schoolNumber = 66;
        System.out.println("$schoolNumber: " + $schoolNumber);

        int schoolNumber1 = 77;
        System.out.println("schoolNumber1: " + schoolNumber1);

        // YAZAMAZSINIZ.
        // int schoolNumber = 11; // aynı isimde yazamazsınız.
        // int 44schoolNumber = 11; // sayı ile başlayamazsınız.
        // int ~schoolNumber = 11; // özel simge ile başlayamazsınız.
        // int school-number = 11; // KebapCase kuralına göre yazamazsınız.
        // int school number = 11; // Boşluk bırakamazsınız.

        // YAZMAYALIM.
        // float TotalSalary = 14.5355f; -> CamelCase kuralına uymuyor.

        // SABIT
        final int MAX_STUDENT = 100; // final ile sabit tanımlanır. Değeri değiştirilemez. JS'deki const gibi.
        System.out.println("MAX_STUDENT: " + MAX_STUDENT);
    }
}
