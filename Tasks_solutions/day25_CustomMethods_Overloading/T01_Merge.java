package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class T01_Merge {
    public static void main(String[] args) {

        String[] str1={"Java","is"};
        String[] str2={"Language","Programming"};

        String[] str3=merge(str1,str2);

        System.out.println(Arrays.toString(str3));

        System.out.println("-----------------------------");

        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int[] arr3=merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));


    }




    public  static double[] merge(double[] arr1,double[] arr2){

        double[] result=new double[arr1.length+ arr2.length];

        int i=0;
        for (double each : arr1) {
            result[i++]=each;

        }
        for (double each : arr2) {
            result[i++]=each;

        }
        return  result;
    }

    public  static String[] merge(String[] arr1,String[] arr2){

        String[] result=new String[arr1.length+ arr2.length];

        int i=0;
        for (String each : arr1) {
            result[i++]=each;

        }
        for (String each : arr2) {
            result[i++]=each;

        }
        return  result;
    }




    public  static char[] merge(char[] arr1,char[] arr2){

        char[] result=new char[arr1.length+ arr2.length];

        int i=0;
        for (char each : arr1) {
            result[i++]=each;

        }
        for (char each : arr2) {
            result[i++]=each;

        }
        return  result;
    }



    public  static int[] merge(int[] arr1,int[] arr2){

        int[] result=new int[arr1.length+ arr2.length];

        int i=0;
        for (int each : arr1) {
            result[i++]=each;

        }
        for (int each : arr2) {
            result[i++]=each;

        }
        return  result;
    }


}
/*
1. create a method that can merge two integer arrays.
	2. create a method that can merge two double arrays.
	3. create a method that can merge two char arrays.
	4. create a method that can merge two String arrays.
 */