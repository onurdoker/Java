package com.onurdoker._1_part_javatype;

public class _06_Math {

    public static void main(String[] args) {

        System.out.println("En küçük: " +Math.min(3,10)); // sadece iki değeri karşılaştırıyor.
        System.out.println("En büyük: " +Math.max(3,10)); // sadece iki değeri karşılaştırıyor.
        System.out.println("Mutlak değer: " +Math.abs(-10)); // mutlak değerini alır.

        System.out.println("Karekök: " +Math.sqrt(25)); // karekökünü alır.
        System.out.println("Karekök: " +Math.sqrt(+25)); // karekökünü alır.
        System.out.println("Karekök: " +Math.sqrt(Math.abs(-25))); // karekökünü alır.

        System.out.println("Üs alma: " +Math.pow(2,5)); // 2 üzeri 5

        System.out.println("Alta yuvarlama: " +Math.floor(2.9)); // Aşağıya yuvarlama
        System.out.println("Üste yuvarlama: " +Math.ceil(2.1)); // Yukarıya yuvarlama -> 3
        System.out.println("Üste yuvarlama: " +Math.ceil(2.0000000001)); // Yukarıya yuvarlama -> 3
        System.out.println("Yuvarlama: " +Math.round(2.4999999999)); // aşağıya yuvarlama -> 2
        System.out.println("Yuvarlama: " +Math.round(2.50000000001)); // yukarıya yuvarlama -> 3

        System.out.println("Pi: " +Math.PI); // Pi sayısı
        System.out.println("Euler: " +Math.E); // Euler sayısı

        System.out.println("Trigonumetrik: " +Math.sin(1)); // Trigonometrik sinüs
        System.out.println("Trigonumetrik: " +Math.cos(1)); // Trigonometrik cosinüs
        System.out.println("Trigonumetrik: " +Math.tan(1)); // Trigonometrik tanjant
        System.out.println("Trigonumetrik: " +Math.atan(1)); // Trigonometrik arctanjant
        // Java'da cotanjant yoktur, cotanjant = 1/tanjant'dan hesaplanır.

    }
}
