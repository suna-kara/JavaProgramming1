package day21_ArraysUtilitiyForEachLoop;

import java.util.Arrays;

public class task1SortInteger {
    public static void main(String[] args) {
        /*
        1. Write a program that sort(ayırmak) the array of integer in descending(azalan)
order(emir vermek,komut vermek)
         */

        int[] nums={1,2,3,4,5,6,7,8,9};
        Arrays.sort(nums);

        int[] descending=new int[nums.length];
        int i=0;

        for (int j=descending.length-1; j>=0; j--){
            descending[i++]=nums[j];
        }

        System.out.println(Arrays.toString(descending));




    }
}
