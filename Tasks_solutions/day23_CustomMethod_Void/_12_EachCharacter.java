package day23_CustomMethod_Void;

public class _12_EachCharacter {
    public static void main(String[] args) {
        eachCharacter("Java Programming");
    }
    // 13. create a method named printEachChar that can print each
    //         characters of a string


    public static void  eachCharacter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }


}
