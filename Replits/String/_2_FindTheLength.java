package String;

import java.util.Scanner;

public class _2_FindTheLength {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Please enter the text: ");
        String input=in.nextLine();

        System.out.println("Length is: " + input.length());
    }
}
/*
Write a program that will output length of the text (string).

Example:

Display message: "Please enter the text:"
Display message: "Please enter the text:"
input: java
input: java
Display message: "Length is: 4"
 */