package day19;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        //Write a program that can return the index number of the first
        //unique character.
        String str = "aabbbcddee";
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch == each) {

                    frequency++;
                }

            }
            if (frequency == 1) {

                System.out.println(str.indexOf(ch));
                break;

            }
            System.out.println(result);
        }
    }
}
