package day24_CustomMethods_Return;

public class T03_Reverse {
    public static void main(String[] args) {

        String str1=reverse("Java");

        String str2=reverse("Wooden Spoon");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println("----------------------------");

        System.out.println(isPalindrome("Anna"));


    }


    public  static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);


        }
        return  result;
    }

    public static  boolean isPalindrome(String str){
        String reversed=reverse(str);
        return reversed.equalsIgnoreCase(str);
    }
}
/*
3. create a method named reverse that passes one string parameter,
the method can return the reversed string
Ex:
str = "Java";
reverse(str) ==> avaJ
 */
/*
4. By using the reverse method above to create another method named
isPalindrome  that passes a String parameter, the method returns true if
the string is palindrome, otherwise returns false
Ex:
str = "Level"
isPalindrome(str) ===> true
 */