package com.java.basics.casting;

// Converting one datatype to another datatype in the 
// same genre is known as casting and typecast.

public class TypeCast {
    public static void main(String[] args) {
        // When converting from byte to larger datatypes such as short,int and long, explicit casting is
        // not needed bcz these are widening conversions. Java performs them implicitly.
        // Let we have a byte and i want to convert it to short and long and int datatype.
        byte byteData = 10;
        short shortData = byteData;
        int intData = byteData;
        long longData = byteData;

        // You need explicit casting when converting from a larger type
        // to a smaller one such as int to byte.

        int a = 10;
        byte b = (byte) a; // We have to explicitly cast it.
    
        long l = 1000l;
        short s = (short) l;
    }
}
