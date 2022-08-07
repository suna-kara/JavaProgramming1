package week08;

import java.util.Arrays;

public class _1_ArrayExample {
    public static void main(String[] args) {
        // declare and initialize an Array

        int code=200;

        int [] codes=new int[8];// my codes array holds 8 elements, they are all int type

        System.out.println(Arrays.toString(codes));// how we print an array

       codes[0]=200; // first element
       codes[1]=201; // second element


        System.out.println(Arrays.toString(codes));

       int[] satatusCodes={200,201,202,203,204,205,400,401};// another way of declaring and initializing

        System.out.println("-----------------------------size of an array------------------------");

        //String str="Java";  str.length()-------------> size of the string

        // for array


        System.out.println("the size of our array = " + satatusCodes.length);

        int sizeOfArray= satatusCodes.length;//8,use it for creating loops

        String[] responseTypes=new String[]{"OK","Created","No Content","Bad Request","Unauthorized","Forbidden","Not Found","Internal Server Error"};


        for (int i = 0; i < sizeOfArray; i++) {

            String text=satatusCodes[i]+" : "+responseTypes[i];
            System.out.println("Each status Code means="+text);

        }







    }
}
