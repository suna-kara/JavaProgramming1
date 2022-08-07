package day24_CustomMethods_Return;

import java.util.Arrays;

public class T02_Anagram {
    public static void main(String[] args) {
     String   str1 = "cba";
       String str2 = "bac";
        System.out.println(isAnagram(str1,str2));

    }
    public static boolean isAnagram(String str1, String str2){
        char[] arr1=str1.toCharArray();
        Arrays.sort(arr1);

        char[] arr2= str1.toCharArray();

        Arrays.sort(arr2);

        boolean isAnagram=Arrays.equals(arr2,arr1);
        return isAnagram;

    }
}
/*
2. create a method named isAnagram that passes two String parameters,
the method returns true if the given two strings are anagram, otherwise
returns false
Ex:
str1 = "cba"
str2 = "bac";
isAnagram(str1, str2) ====> true
 */