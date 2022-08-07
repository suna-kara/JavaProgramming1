package day25_Method_Overloading;
import utilities.StringUtility;
public class _6_Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("---------------------------");

        String str1 = "Wooden Spoon";

        String reverse = StringUtility.reverse(str1);

        System.out.println(reverse);

        System.out.println("------------------------------");

        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        System.out.println("--------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }


        }

        System.out.println(count);

            System.out.println("------------------------------");

            String s2="aaaabbbbcccdd";

            String nonDup=StringUtility.removeDuplicates(s2);

            System.out.println(nonDup);


        }
    }

