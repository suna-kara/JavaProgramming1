package String;

import java.util.Scanner;

public class _7_Duplicate {
    public static void main(String[] args) {
        /*
        You have 2 words

Print the first word, second word, second word, first word

Input:
​
one
​
two
Input:

one

two
Output:
​
onetwotwoone
         */
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        System.out.println(word1.concat(word2).concat(word2).concat(word1));















    }
}
