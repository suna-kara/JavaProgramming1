package String;

import java.util.Scanner;

public class _4_printLastChar {
    public static void main(String[] args) {
        /*
        Write a program that will print out last letter of the word (string).

Ex:

Input: java
Input: java
Output: a
         */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(word.charAt(word.length()-1));
    }
}
