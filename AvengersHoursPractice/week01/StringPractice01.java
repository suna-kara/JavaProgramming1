package week01;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPractice01 {
    /**
     * 1.
     * Ask for a String input from user
     * Create a method that will return
     *
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

    }
public static void firstTwoChars2(String str){
    System.out.println(str.toUpperCase().substring(0,2));
}
    public static String firstTwoChars3(String str){
        str=str.toUpperCase().substring(0,2);
        String s=""+str.charAt(0)+str.charAt(1);
        return s;


    }
    public static String FirstTwoChars(String str){
        char[] cahrArr=str.toCharArray();
        return (""+cahrArr[0]+cahrArr[1]).toUpperCase();
    }
    public static String FirstTwoChars5(String str){
        char[] cahrArr=str.toCharArray();
        ArrayList<Character> list=new ArrayList<>();
        for (Character each : cahrArr) {
            list.add(each);
        }
    String s=""+list.get(0)+list.get(1);
        return s.toUpperCase();
    }

}
