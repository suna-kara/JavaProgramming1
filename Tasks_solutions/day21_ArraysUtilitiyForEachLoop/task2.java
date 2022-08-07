package day21_ArraysUtilitiyForEachLoop;

public class task2 {
    public static void main(String[] args) {
        /*
        2. Write a program that can count the even and odd number from an
array of integers
         */

        int[] numbers={0,21,28,3,45,52,65,70,85,93};
        int even=0;
        int odd=0;

        for (int each: numbers) {
            if (each%2==0){
                even++;
            }else{
                odd++;
            }

        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);


    }
}
