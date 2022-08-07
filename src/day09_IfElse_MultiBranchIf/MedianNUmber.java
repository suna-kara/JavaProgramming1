package day09_IfElse_MultiBranchIf;

public class MedianNUmber<cIsMedian, bIsMedian> {
    public static void main(String[] args){
       int a = 1000,
           b = 200,
           c = 30;

       //     a = 15,b = 10, c = 10  a= 15, c = 10, b = 20
       boolean aIsMedian= (a > b && a < c ) || (a > c && a < b);
/*
in order for a to b the median number:
1. if c is the max number & b is thr min number, then a is the median number
2. if b is the max number & c is the min number, then a is the median number
 */

       //                  b = 15, a = 10,c= 20  a= 20, b= 15, c = 10
       boolean bIsMedian = (b > a && b < c) ||  (b > c && b < a );


       boolean cIsMedian= !aIsMedian && !bIsMedian;


       if(aIsMedian){// a is the median number
           System.out.println(a+" is median number");
       }
        if(bIsMedian){// b is the median number
            System.out.println(b+" is median number");


        }

        if(cIsMedian){// c is the median number

            System.out.println(c+" is median number");

        }




    }

}
/*
... Create a class called MedianNumber. write a program that can find
the median number between three DIFFERENT given integers
Ex:
a = 10, b= 15, c = 20;
Output:
15 is the median number
Posibility #1: a could be median number
Posibility #2: b could be median number
Posibility #3: c could be median number
 */