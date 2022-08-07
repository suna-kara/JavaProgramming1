package week06;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        /**
         * Question-8:
         *
         * write a prog that calculate the sum of the numbers from 1 till upper bound.
         * if upper bound is 5,sum should be 1+2+3+5=15.
         * if upper bound is 11,sum should be 1+2+3+...+11=66.
         * if upper bound is100,sum should be 1+2+3+....+100=5050.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a valid bound :");
        int upperBound=scan.nextInt();

        int sum=0;
        boolean check= true; // initialization
        for(; check ; ) {
            if (upperBound >= 1) {
                for (int i = 1; i <= upperBound; i++) {
                    sum += i;

                }
                check = false;//iteration
            } else {


                System.out.println("Please Enter a valid number Again : ");

                upperBound = scan.nextInt();
                //  check = true;  // iteration


            }
        }
            System.out.println("sum = " + sum);




    }
}
