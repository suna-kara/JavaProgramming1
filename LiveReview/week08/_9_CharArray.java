package week08;

public class _9_CharArray {
    public static void main(String[] args) {
        char[] letters = {'j','a','v','a',' ','i','s',' ','f','u','n'};

        for (char letter: letters){
            System.out.print(letter+"");
        }

        String sentence=new String(letters);
        System.out.println(" sentence = "+sentence);

        //there is opposite of action

        char[] newArray=sentence.toCharArray();
        for (char c: newArray){
            System.out.print(c+"");

        }





















    }
}
