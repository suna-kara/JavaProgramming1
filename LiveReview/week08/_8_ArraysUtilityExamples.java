package week08;

import java.util.Arrays;

public class _8_ArraysUtilityExamples {
    public static void main(String[] args) {
        int [] nums={5 , 10 , 4 , 1000 , 35};

        //Arrays utility class created by Java developers and it has some useful methods that
        // we can use
        Arrays.sort(nums);
        System.out.println("Arrays.toString(nums) : "+Arrays.toString(nums));

        int[] numsThree=nums;// creating a new reference for the same obj

        int [] numsTwo={4, 5, 10, 35, 1000};

        // Arrays.equals() used to check if two arrays contents are equal
        System.out.println("Arrays.equals(nums, numsTwo) : "+Arrays.equals(nums,numsTwo));

        System.out.println(nums==numsTwo);// false checking if the object is equal


        System.out.println(nums==numsThree);
        System.out.println(Arrays.equals(nums,numsThree));
nums[0]=5000;
        System.out.println(Arrays.toString(numsThree));


// copy of method

        int [] numsFour=Arrays.copyOf(nums,nums.length);
        nums[0]=3000;
        System.out.println(Arrays.toString(numsFour));






    }
}
