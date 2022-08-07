package day24_Arrays;

public class Polindrome {
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



        for (String word : words) {
            String reverse="";
            for (int j =words.length;j>=0; j--) {
               reverse +=word.charAt(j);

            }
            if (word.equalsIgnoreCase(reverse)){
                count++;
            }
        }
        System.out.println(count);













    }
}
