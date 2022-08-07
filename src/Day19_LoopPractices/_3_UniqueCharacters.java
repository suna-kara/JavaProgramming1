package Day19_LoopPractices;

public class _3_UniqueCharacters {
    public static void main(String[] args) {
/*
````
. Write a program that can find the unique characters from a string
without using indexOf() and lastIndexOf() methods
Ex:
str = "aabccdeef";
output:
bdf
````
 */

        String str = "aabccdeef";
        String result = "";

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);
            int count = 0;//represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) {//compares the character that outer loop picked,with each character

                char each = str.charAt(i);

                if (ch == each) {
                    count++;
                }

            }
            /*
            if (count==1){//if the frequency of character is 1,then the character is unique
                result +=ch;
            }*/
            if (count!=1){
                continue;
            }
            result +=ch;
        }
        System.out.println(result);
    }
}
