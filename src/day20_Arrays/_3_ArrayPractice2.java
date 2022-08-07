package day20_Arrays;

import java.util.Arrays;

public class _3_ArrayPractice2 {
    public static void main(String[] args) {
        char[] letters=new char[26];
/*
       letters[0]='A';
       letters[1]= 'B';
*/
/*
        for (char i = 'A', j=0; i <='Z' && j< letters.length ; i++, j++) {//j:index num 0~last index
            letters[j]=i;

        }

 */

        char ch='A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] =ch;


        }
        System.out.println(Arrays.toString(letters));// [A~Z]

        System.out.println("---------------------------");



        char ch2='Z';

        char[] letters2=new char[26];//[Z~A]

        for (int i=0;i<letters2.length; i++,ch2--) {

            letters2[i]=ch2;

        }

        System.out.println(Arrays.toString(letters2));
    }
}
