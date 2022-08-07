package day24_Arrays;

import java.util.Scanner;

public class FindNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        for (int each : nums) {   //duplicates lerde karşılaştırma var.iç içe iki loop lazım
                                  // dışarda kalırsa
           int count=0;
            for (int element : nums) {

                if (each==element){
                    count++;
                }

                }
            if (count==1){
                System.out.println(each);
            }
        }







    }
    }
/*
Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
 */