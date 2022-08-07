package day19;

public class TwiceString {
    public static void main(String[] args) {
      /*  Write a program that can display all the characters that appeared
        twice in the string.*/
        String str="aabbbccddee";
        String result="";
        for (int i = 0; i < str.length(); i++) {

            char ch=str.charAt(i);
            int frequency=0;

            for (int j = 0; j < str.length(); j++) {
                char each=str.charAt(j);
                if (ch==each){

                    frequency++;
                }

            }
            if (frequency==2){

                if ((result.contains(""+ch))){
                    continue;
                }
                result += " "+str.charAt(i);
                //  System.out.println(ch);
                // System.out.println(str.indexOf(ch));


            }

        }
        System.out.println(result);
    }

}
