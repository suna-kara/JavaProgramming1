package day24_CustomMethods_Return;

import utilities.ArraysUtility;

import java.util.Arrays;

public class T08_Reverse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int[] array1 = reverse(array);

        System.out.println(Arrays.toString(array1));
    }

    public static int[] reverse(int[] arr) {
      /*  int[] result=new int[arr.length];
        for (int i= arr.length-1, j=0; i>=0;i--,j++){
            result[j]=arr[i];
        }
        return  result;

    }*/
        int[] result = {};
        for (int i = arr.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, arr[i]);
        }
        return result;


    }
}

/*
8. Create method named reverse that passes an integer array
parameter, the method can return the reversed array
Ex:
arr = {10, 20, 30, 40};
reverse(arr) ==> {40, 30,
20, 10}
 */