package day20_Arrays;

import java.util.Arrays;

public class _3_Items {
    public static void main(String[] args) {
        /*
        3. Given the following arrays:
               String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods",
               "iPad", "iPhone 12 case" };
               double[] prices = {99.99,      150.0,  9.99,     250.0 ,
               439.50,  39.99};
               int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,
               12350};
               1. find out the first index number of "Gloves"
               2. find out if "iPad" is contained in the item list
               3. Print the report of each shopping item
               name - price - #ID
         */


        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods",
                "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,
                439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,
                12350};

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")){
                System.out.println("Index number of \"gloves\" is: " + i);

                System.out.println("--------------------------");

                if (Arrays.toString(items).contains("iPad")){
                    System.out.println("iPad is contained in the item list");
                }else{
                    System.out.println("iPad is NOT contained in the item list");
                }
                System.out.println("---------------------------------");
                for (int k = 0; k < items.length;k++) {
                    System.out.println(items[k] + "-"+ prices[k] +"-"+itemIDs[k]+"-");
                }

















            }

        }









    }
}
