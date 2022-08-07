package day24_CustomMethods_Return;

public class T01_frequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java java java python python";
        String word = "java";
        frequencyOfWord(sentence,word);

    }

    public static int frequencyOfWord(String sentence,String word){
        String[] sentenceArray=sentence.split(" ");
        int count=0;

        for (String eachArray : sentenceArray) {
            if (eachArray.equalsIgnoreCase(word)){
                count++
;            }
        }
        System.out.println(count);
        return  count;
    }

}
/*
1.  create a method named frequencyOfWord that passes two
parameters: string sentence and String word, then returns the frequency of
word from the sentence
Ex:
sentence = "Java java java python python"
word = "java";
frequencyOfWord(sentence, word) ==>  3
 */