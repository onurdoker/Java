package com.onurdoker._1_part_javatype;

public class _02_Variables {

    public static void main(String[] args) {

        // Veri değişken isimlerini yazarken;

    /*
    Veri isimlendirmeleri:
        1. isim veya sıfat, zamir kullanmamız lazım.
        2. _ veya $ ile başlayabilir.
        3. _ veya $ dışında özel karakter kullanılamaz.
        4. sayı ile bitebilir.
        5. sayı ile başlayamaz.
        6. değişken isimleri camelCase kuralına göre yazılır.
    */

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

    }
}
