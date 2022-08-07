package day20_Arrays;

import java.util.Arrays;

public class _5_reversedArray {
    public static void main(String[] args) {
        /*
          5.  Write a program that can reverse an array of integers and
               returns it as new array
               ex:
               array = {1,2,3,4,5};
               output:
               reversedArray = {5,4,3,2,1};
         */
    int[]  numbers = {1,2,3,4,5};
    int reverseNums[]=new int[numbers.length];
    int n=0;
        for (int i = numbers.length - 1; i >= 0; i--) {

            reverseNums[n++]=numbers[i];

        }

        System.out.println(Arrays.toString(reverseNums));






















    }
}
