package day20_Arrays;

import Day15_ForLoop.Alphabet;

import java.util.Arrays;

public class _4_Alphabet {
    public static void main(String[] args) {
        char[] alphabets=new char[26];//Z~A
/*                i   ch
        alphabets[0]='Z';//90:ASCİ table daki degeri
        alphabets[1]='Y';//89
        alphabets[2]='X';//88
        ......
        */
        /* ilk çözüm
        char ch='Z';
        for (int i = 0; i < alphabets.length; i++,ch--) {
            alphabets[i]=ch;
        }
        */

        for(char i=0,j='Z'; i< alphabets.length;i++,j--){
            alphabets[i]=j;
        }

       // System.out.println(alphabets);

        System.out.println(Arrays.toString(alphabets));
   //     System.out.println(alphabets[0]);// printing the element of array

    }
}
