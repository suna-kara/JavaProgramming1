package Loops;

import java.util.Scanner;

public class _1_Triangle {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=i ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }


/*
        Scanner scan=new Scanner(System.in);


        int n= scan.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < i; j++) {


                System.out.print("* ");
            }

            System.out.println();
        }
*/
    }
}
/*
Write a program that will create a triangle of asterisks based on size n.

Example:

input: 5

output:
*
**
***
****
*****
input: 5

output:
*
**
***
****
*****
Example:

input: 3

output:
*
**
***
 */