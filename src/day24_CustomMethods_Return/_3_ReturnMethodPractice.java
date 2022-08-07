package day24_CustomMethods_Return;

public class _3_ReturnMethodPractice {
    public static void main(String[] args) {

         // find max num between 100 & 200
         int maxNum= max(100,200);

        System.out.println("maxNum = " + maxNum);


        //multiply the max num by 2
        int multiplication=maxNum *2;

        System.out.println("multiplication = " + multiplication);



    }
    public static int max(int a, int b){
        int result=0;



        if (a>b){
            result =a;

        }else{
            result=b;
        }
        return result;
    }















}
