package ForLoops;

public class FrequencyCharacter {
    public static void main(String[] args) {


        String str="AAABBBBC";

        char ch='B';

        int frequency=0;//+1+1+1==> 3

        for (int i = 0; i < str.length(); i++) {//i:index of str

            char eachChar=str.charAt(i);// eachChar: each character of str

            //'A'=='A'
            if (ch==eachChar){//if given ch is matching with the eachChar,then ch is appeared in the string
                frequency++;

            }


        }
        System.out.println(frequency);

        for ( int i=0; i>=0  ;i++ ) {
            System.out.println("cydeo");

        }

    }
}
