package com.java.strings;

// Some prebuilt methods that comes with java that do operation on String.
public class StringMethods {
    public static void main(String[] args) {
        // 1. Creation and basic info
        String s1 = "Aditya";
        System.out.println("Length : " + s1.length()); // It returns the length of string which is 6
        System.out.println("Is empty : " + s1.isEmpty()); // It returns boolean value if it is empty then returns true else false
        System.out.println("Is blank : " + s1.isBlank()); // It checks for the string is blank or not.

        // 2. Character Access
        String s2 = "Java";
        System.out.println("Char at 1 : " + s2.charAt(1)); // It gives the character at a particular index if the index is out of bound then it gives StringIndexOutOfBoundsException.
        System.out.println("Unicode at index 1 : "+ s2.codePointAt(1)); // Returns the unicode for that index which is specified.
        System.out.println("Unicode before at particular index : " + s2.codePointBefore(2)); // It returns the unicode of index 1.
        System.out.println("Count unicode points : " + s2.codePointCount(0, 3));

        // 3. Comparision
        String s3 = "Oracle";
        System.out.println("Equal to Oracle : " + s3.equals("oracle")); // Returns false cause it is case sensitive.
        System.out.println("Equal ignorecase : " + s3.equalsIgnoreCase("ORacLe")); // Returns true
        System.out.println("Compare two String : " + s3.compareTo("oracle"));
        System.out.println("Compare two string ignore case : " + s3.compareToIgnoreCase("ORACLE"));

        // 4. Searching
        String str1 = "Java Programming";
        System.out.println("Contains 'Program': " + str1.contains("Program")); // Checks if the substring is present.
        System.out.println("Starts with 'Java': " + str1.startsWith("Java")); // Returns true as it starts with 'Java'.
        System.out.println("Ends with 'ing': " + str1.endsWith("ing")); // Returns true as it ends with 'ing'.
        System.out.println("Index of 'a': " + str1.indexOf('a')); // Returns the first occurrence of 'a'.
        System.out.println("Last index of 'a': " + str1.lastIndexOf('a')); // Returns the last occurrence of 'a'.

        // 5. Substring
        System.out.println("Substring from index 5: " + str1.substring(5)); // Returns a part of the string from index 5 to the end.
        System.out.println("Substring from 5 to 11: " + str1.substring(5, 11)); // Returns from index 5 to 10.

        // 6. Case Conversion
        String str2 = "Hello World!";
        System.out.println("To lowercase: " + str2.toLowerCase()); // Converts the string to lowercase.
        System.out.println("To uppercase: " + str2.toUpperCase()); // Converts the string to uppercase.

        // 7. Trimming
        String str3 = "   Extra Spaces   ";
        System.out.println("Original: '" + str3 + "'");
        System.out.println("Trimmed: '" + str3.trim() + "'"); // Removes leading and trailing spaces.

        // 8. Joining and Splitting
        String joined = String.join(", ", "Java", "Python", "C++");
        System.out.println("Joined String: " + joined); // Joins the strings with ", ".
        String[] parts = joined.split(", "); // Splits the string based on ", ".
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        // 9. Replacement
        String str4 = "Banana";
        System.out.println("Replace 'a' with 'o': " + str4.replace('a', 'o')); // Replaces all 'a' with 'o'.
        System.out.println("Replace 'na' with 'ma': " + str4.replace("na", "ma")); // Replaces all "na" with "ma".
        System.out.println("Replace first 'a' with 'o': " + str4.replaceFirst("a", "o")); // Replaces the first occurrence.

        // 10. Pattern Matching
        String str5 = "12345";
        System.out.println("Matches digits only: " + str5.matches("\\d+")); // Checks if it contains only digits.

        // 11. Conversion
        String str6 = "Java";
        char[] chars = str6.toCharArray(); // Converts the string to a character array.
        System.out.print("Characters in 'Java': ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 12. Formatting
        String formatted = String.format("Hello %s, your score is %d", "Aditya", 95);
        System.out.println("Formatted String: " + formatted);

        // 13. Utility Methods
        System.out.println("HashCode of 'Java': " + str6.hashCode()); // Generates a hash code for the string.
        System.out.println("String representation: " + str6.toString()); // Returns the string itself.
    }
}
