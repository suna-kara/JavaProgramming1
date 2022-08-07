package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _5_ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length=scan.nextInt();//5

        if (length<=0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        int[] numbers=new int[length];//[0,0,0,0,0]// arrays need to have enough capasity to contain all the elements user going to enter

        for (int i = 0; i < length; i++) {//i:0,1...
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt(); //5 //10,20,...50 // each input user provided during each execution of the loop,will be assigned to the indexes of the array

        }


        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}
