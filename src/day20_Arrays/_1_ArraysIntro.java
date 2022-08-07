package day20_Arrays;

import java.util.Arrays;

public class _1_ArraysIntro {
    public static void main(String[] args) {
        //create a variable that's capable enough to contain 5 names

       // String[] myGroup=new String[5]; //output:[null, null, null, null, null]

       // int[] myGroup=new int[5];

        String[] myGroup=new String[5];//0~4
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";

        //System.out.println(myGroup);//hashcode

        System.out.println(Arrays.toString(myGroup));//"Gunay", "Neira", "Suat","Hulya", "Mikael"

        System.out.println("-----------------------------");

        String[] days={"Monday","Thuesday","Wednesday","Thursday","Friday","Staturday","Sunday"};
        //index:          0         1         2           3          4          5         6
        System.out.println(Arrays.toString(days));

        int number=2;

        if (number <1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);
    }
}
