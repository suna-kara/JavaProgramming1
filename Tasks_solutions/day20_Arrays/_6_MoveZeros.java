package day20_Arrays;

import java.util.Arrays;

public class _6_MoveZeros {
    public static void main(String[] args) {
        /*
           6. write a program that can move all the zeros to the end of the array
               Ex:
               array = {10, 0, 5, 0, 1, 0};
               output:
               {10, 5, 1, 0, 0, 0}
         */

        int[] arr={10, 0, 5, 0, 1, 45},

        moveZeros=new int[arr.length];

        int n=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                moveZeros[n++]=arr[i];

            }

        }

        System.out.println(Arrays.toString(moveZeros));

















    }
}
