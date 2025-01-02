package com.java.strings;

// StringBuffer - A thread safe mutable sequence of character, it is also like a string but can be modified
// It can be used in a multithreaded program cause it is thread safe.
/*
Note: Both String and StringBuffer objects are thread safe.
StringBuffer is synchronized, making it thread-safe, but this does not mean that multiple threads can access it
simultaneously without potential performance issues.
Immutable objects are by default thread-safe because their state can not be modified once created.
Since String is immutable in Java, it’s inherently thread safe.
 */
public class StringBufferClass {
    public static void main(String[] args) {

        // By default, the reserved buffer size of the stringbuffer is 16 characters
        StringBuffer sb1 = new StringBuffer();
        // We can give the size of the buffer as argument
        StringBuffer sb2 = new StringBuffer(20); // It is of size of 20 characters
        // we can give itself the string to the stringbuffer too.
        StringBuffer name = new StringBuffer("StringBuffer");
        name.append(" Something");
        System.out.println(name); // Prints StringBuffer Something.

        // StringBuffer comes with some methods means we can apply some operation on string buffer

        // 1. Append - If we want to append a thing to it then we do this..
        StringBuffer word = new StringBuffer("Aditya Pawar");
        word.append(" Loves coding");
        System.out.println(word); // It prints out Aditya Pawar Loves coding.

        // 2. Insert - If we want to insert a string at particular index we can do this
        word.insert(0, "Hey there ");
        System.out.println(word); // Prints - Hey there Aditya Pawar Loves coding.

        // 3. Delete - Delete a sequence of characters from a particular index to at a index
        word.delete(0, 10);
        System.out.println(word); // Prints - Aditya Pawar Loves coding.

        // 4. Reverse - It reverse the orders of character in a buffer.
        word.reverse();
        System.out.println(word); // Prints - gnidoc sevoL rawaP aytidA

        // 5. Replace - For replacing a string from start index to end index.
        StringBuffer newWord = new StringBuffer("Hey there");
        newWord.replace(1, 3, "oi"); // it includes the start index but exclude the end index.
        System.out.println(newWord); // Prints - Hoi there

        // There are some other methods too charAt, deleteCharAt etc read the geekforgeeks docs..
    }
}