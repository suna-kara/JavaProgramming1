package String;

import java.util.Scanner;

public class _5_PrintFirstAndLastLetters {
    public static void main(String[] args) {
        /*
//Write a program that will print out first and last letters together.
//
//        ```
//        Input: adobe
//        ```
//
//        ```
//        Output: ae
//        ```
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(Character.toString(word.charAt(0)) +Character.toString(word.charAt(word.length()-1)));




    }
}
