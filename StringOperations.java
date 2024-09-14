
package com.mycompany.arrayproblem;
public class StringOperations {

    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Java Programming";
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Uppercase of str1: " + str1.toUpperCase());
        System.out.println("Lowercase of str1: " + str1.toLowerCase());
        String concatenatedString = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concatenatedString);
        System.out.println("Substring of str1 (0 to 4): " + str1.substring(0, 5));
        String replacedString = str1.replace('l', 'K');
        System.out.println("Replaced 'l' with 'K' in str1: " + replacedString);
        System.out.println("Comparing str1 and str2 (using equals): " + str1.equals(str2));
        System.out.println("Comparing str1 and str2 (using compareTo): " + str1.compareTo(str2));
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        System.out.println("Does str1 contain 'World': " + str1.contains("World"));
 
    }
}
