package com.onurdoker._1_part_javatype;

public class _02_JavaPrimitiveTypes {

    // psvm
    public static void main(String[] args) {

        // Primiti Types: 8 tanedir. null değer alamazlar.
        // Tam sayılar (4 adet): byte, short, int, long
        byte b1 = 127; // -128 ile 127 arasında
        System.out.println("byte: " + b1);
        short s1 = 32767; // -32768 ile 32767 arasında
        System.out.println("short: " + s1);
        int i1 = 2147483647; // -2147483648 ile 2147483647 arasında
        System.out.println("int: " + i1);
        long l1 = 9223372036854775807L; // -9223372036854775808 ile 9223372036854775807 arasında sonuna L eklenir.
        System.out.println("lng: " + l1);

        // Ondalıklı sayılar (2 adet): float, double
        float f2 = 3.4028235E38f; // 1.4e-45 ile 3.4028235e38 arasında sonuna f eklenir.
        System.out.println("float: " + f2);
        double d2 = 1.7976931348623157E308; // 4.9e-324 ile 1.7976931348623157e308 arasında
        System.out.println("double: " + d2);

        // Boolean: true, false
        boolean b3 = true; // true, false değerlerini alır.
        System.out.println("boolean: " + b3);

        // char: 16 bitlik Unicode karakterlerini tutar.
        char c4 = 'A'; // tek tırnak ile yazılır.
        System.out.println("char: " + c4);
    }
}
