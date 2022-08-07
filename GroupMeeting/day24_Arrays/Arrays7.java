package day24_Arrays;

import java.util.Arrays;

public class Arrays7 {
    public static void main(String[] args) {
        String str="I love Java";
    String[] word= str.split("");   //şu anda bu arry olarak döner.boşluk verdiğimiz için her kelimeyi ayırır

        System.out.println(Arrays.toString(word));

        for (int i = word.length-1; i >= 0; i--) {

         //   System.out.print(word[i] + " ");
        }
        for (String each : word) {
            String reversed="";
            for (int i = each.length()-1; i > 0; i--) {
                reversed +=each.charAt(i);

            }
            System.out.println(reversed + " ");
        }

    }
}
