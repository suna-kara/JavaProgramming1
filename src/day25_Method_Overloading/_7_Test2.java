package day25_Method_Overloading;

import utilities.ArraysUtility;

public class _7_Test2 {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5,};

        ArraysUtility.printEachElement(arr1);

        System.out.println("---------------------------");

         double[] arr2={1.5,2.5,3.5,4.5};
          ArraysUtility.printEachElement(arr2);

          System.out.println("---------------------------");
char[] arr3={'A','B','C','D'};
ArraysUtility.printEachElement(arr3);


        System.out.println("---------------------------");

       String[] arr4={"David","Almira","Ali","Sedef"};
ArraysUtility.printEachElement(arr4);

        System.out.println("---------------------------------");

int[] n1={10,2,3,4,5,6};

int max1=ArraysUtility.max(n1);

        System.out.println("max1 = " + max1);



        System.out.println("---------------------------------");

        double[] n={10.2,2.2,3.5,5.4,5.8,6.0};

       double max=ArraysUtility.max(n);

        System.out.println("max = " + max);

        System.out.println("--------------------------------------");

        int[] a1={1,2,3,4,5,6,7};
        boolean r1=ArraysUtility.contains(a1,10);

        System.out.println("r1 = " + r1);





    }

























}
