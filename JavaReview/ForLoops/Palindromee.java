package ForLoops;

public class Palindromee {public static void main(String[] args) {

    String word= "Racecar";

    String reversed="";

    for(int i=word.length()-1; i>=0; i--){

        reversed +=word.charAt(i);

    }

    System.out.println(word.equalsIgnoreCase(reversed));



       /*  String str="JavaJava";
         int count=0;
        for (int i = 0; i < str.length()-4; i++) {
            String s=

*/
}



}

/*
 "Java" ==> "avaJ" ===> false (not palindrome)
 "Anna" ==> "annA" ===>true
 "Level"
 "Racecar
 Dad
 Mom
 ....
 */

