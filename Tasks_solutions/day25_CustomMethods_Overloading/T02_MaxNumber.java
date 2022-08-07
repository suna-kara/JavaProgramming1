package day25_CustomMethods_Overloading;

public class T02_MaxNumber {

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80};

        int n=maxNumber(arr);

        System.out.println(n);


    }
    
    public static int maxNumber(int[] array){
        int max=array[0];

        for (int each : array) {
            if (each>max){
                max=each;
            }
        }
        return  max;
    }

    public static double maxNumber(double[] array){
        double max=array[0];

        for (double each : array) {
            if (each>max){
                max=each;
            }
        }
        return  max;
    }

    public static long maxNumber(long[] array){
        long max=array[0];

        for (long each : array) {
            if (each>max){
                max=each;
            }
        }
        return  max;
    }


    public static short maxNumber(short[] array){
        short max=array[0];

        for (short each : array) {
            if (each>max){
                max=each;
            }
        }
        return  max;
    }

    public static float maxNumber(float[] array){
        float max=array[0];

        for (float each : array) {
            if (each>max){
                max=each;
            }
        }
        return  max;
    }

    public static byte maxNumber(byte[] array){
        byte max=array[0];

        for (byte each : array) {
            if (each>max){
                max=each;
            }
        }
        return  max;
    }
    
}

/*
Task 2:
	1. create a method that can return the max number from an integer array
	2. create a method that can return the max number from double array
	3. create a method that can return the max number from long array
	4. create a method that can return the max number from short array
	5. create a method that can return the max number from float array
	6. create a method that can return the max number from byte array
 */