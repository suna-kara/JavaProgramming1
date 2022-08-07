package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class _2_UniqueElements {
    public static void main(String[] args) {
        int[] array={1,1,2,3,3,4,5,5,6,7,7,7};

        int[] unique=uniqueElements(array);

        System.out.println(Arrays.toString(unique));


        double[] array2={2.5,4.5,12.0,5.5,5.5,6.5};

        double[] unique2=uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));

    }
     // returns the unique elements of the array as a new array
    public  static int[] uniqueElements(int[] array){// if the frequency is one,the element is unique

        int[] result={};// new int[0]

        for (int each : array) {


            if (ArraysUtility.frequencyOfElement(array,each)==1){
              result=  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {}; //new int[0]

        for (double each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }
}
