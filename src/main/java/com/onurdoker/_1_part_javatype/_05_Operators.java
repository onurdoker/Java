package com.onurdoker._1_part_javatype;

public class _05_Operators {

    public static void main(String[] args) {
        // Operattör yapılar
        // +
        // -
        // *
        // /
        // %
        // ++
        // --

        // addition (toplama)
        int number1 = 23, number2 = 7; // birden fazla değişkeni tek satırda tanımlayabiliriz.
        int addition = number1 + number2;
        System.out.println("Toplam " + addition);

        // subtraction (çıkarma)
        int subtraction = number1 - number2;
        System.out.println("Çıkarma " + subtraction);

        // multiplication (çarpma)
        int multiplication = number1 * number2;
        System.out.println("Çarpma " + multiplication);

        // increment (arttırma) -> 1 arttırır
        int increment = number1++;
        System.out.println("Arttırma " + increment);

        // decrement (azaltma) -> 1 azaltır
        int decrement = number1--;
        System.out.println("Azaltma " + decrement);

        // division (bölme)
        int division = number1 / number2;
        System.out.println("Bölme " + division);

        // modulus (mod alma)
        int modulus = number1 % number2;
        System.out.println("Kalan " + modulus);

        // Mantıksal Operatörler:
        // && = VE
        // || = VEYA
        // ! = DEĞİL

    }
}
