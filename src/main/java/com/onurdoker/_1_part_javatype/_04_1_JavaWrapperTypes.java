package com.onurdoker._1_part_javatype;

public class _04_1_JavaWrapperTypes {

    public static void main(String[] args) {
        // primitive Type  --> Küçük harf ile başlar
        byte primitiveTypeByte = 127;
        // primitiveTypeByte = null; // null değer alamaz.
        System.out.println("primitiveTypeByte: " + primitiveTypeByte);
        short primitiveTypeShort = 32767;
        System.out.println("primitiveTypeShort: " + primitiveTypeShort);
        int primitiveTypeInt = 2147483647;
        System.out.println("primitiveTypeInt: " + primitiveTypeInt);
        long primitiveTypeLong = 9223372036854775807L;
        System.out.println("primitiveTypeLong: " + primitiveTypeLong);

        float primitiveTypeFloat = 3.4028235E38f;
        System.out.println("primitiveTypeFloat: " + primitiveTypeFloat);
        boolean primitiveTypeBoolean = true;
        System.out.println("primitiveTypeBoolean: " + primitiveTypeBoolean);

        char primitiveTypeChar = 'A';
        System.out.println("primitiveTypeChar: " + primitiveTypeChar);

        // Wrapper Type --> Büyük harf ile başlar
        Byte wrapperTypeByte = null;
        // wrapperTypeByte = null; // null değer alabilir.
        System.out.println("wrapperTypeByte: " + wrapperTypeByte);
        Short wrapperTypeShort = 32767;
        System.out.println("wrapperTypeShort: " + wrapperTypeShort);
        Integer wrapperTypeInt = 2147483647;
        System.out.println("wrapperTypeInt: " + wrapperTypeInt);
        Long wrapperTypeLong = 9223372036854775807L;
        System.out.println("wrapperTypeLong: " + wrapperTypeLong);

        Float wrapperTypeFloat = 3.4028235E38f;
        System.out.println("wrapperTypeFloat: " + wrapperTypeFloat);
        Boolean wrapperTypeBoolean = true;
        System.out.println("wrapperTypeBoolean: " + wrapperTypeBoolean);

        Character wrapperTypeChar = 'A';
        System.out.println("wrapperTypeChar: " + wrapperTypeChar);


    }
}
