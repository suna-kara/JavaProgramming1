package day20_Arrays;

import java.util.Arrays;

public class _12_ArraysUtility {//utility:yardımcı program

    public static void main(String[] args) {
        int[] numbers={10,9,0,1,2,20,4,6,7,8,};
        System.out.println(Arrays.toString(numbers));

     Arrays.sort(numbers);// sort the array in ascending order(sıralama:sort ascending:artan sırada order: komut vermek6
        System.out.println(Arrays.toString(numbers));
    }
}
