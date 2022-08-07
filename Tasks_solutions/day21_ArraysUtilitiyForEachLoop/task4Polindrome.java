package day21_ArraysUtilitiyForEachLoop;

public class task4Polindrome {
    public static void main(String[] args) {
        /*
        4. write a program that can count how many palindromes in an array of
string
Ex:
{"anna", "level", "Java"};
output:
2
    */

       String[] words= {"anna", "level", "Java"};
       int count=0;
       for (String each : words){
           String reverse="";
           for (int i = each.length()-1; i >= 0; i--) {
               reverse +=each.charAt(i);

               if (reverse.equals(each)){
                   count++;
               }

           }
       }
        System.out.println(count);















    }
}
