package day23_CustomMethod_Void;

public class _3_EachCharacter {
    public static void eachCharacter(String str){
        /*
	12. create a method named printEachChar that can print each characters of a string
 */
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println(str);
    }
}
