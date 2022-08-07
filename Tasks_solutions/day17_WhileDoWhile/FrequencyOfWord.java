package day17_WhileDoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence="JavaJavaJava";

        int frequency=0;

        for (int i = 0; i <sentence.length()-3 ; i++) {
            String eachSub=sentence.substring(i,i+4);
            if (eachSub.equals("Java")){
                frequency++;
            }

        }
        System.out.println(frequency);
    }
}
