package week08;

import java.util.Arrays;

public class _5_SentenceSplit {
    public static void main(String[] args) {
        String serchResult= "1-16 of 829 results for iPad";
        //in my MovieObject cases I want to verify that my search result comes over 500

        //split method turns your string into array

        String[] each=serchResult.split(" ");

        System.out.println(Arrays.toString(each));

        String searchAmount=each[2];
        System.out.println("searchAmount = " + searchAmount);



























    }
}
