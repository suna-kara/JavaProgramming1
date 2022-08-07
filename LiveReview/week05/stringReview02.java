package week05;

import java.util.Locale;

public class stringReview02 {
    public static void main(String[] args) {
        /*
        length():it does not take parameter, it returns an integer number
        replace()
        toUpper or Lower case
        substring
        charAt()
        indexof()
        lastindex()
        equals()
        trim()

         */
    String message = "EU8 is Avesume!!";
    int count = message.length();
        System.out.println("how many character we have: "+count);
        System.out.println(count==16);
        if(message.length()==16);
        System.out.println("happy testing");
        System.out.println("message after uppercase");
        System.out.println(message);
        // assign changes to a reference
       String messageTwo= message.toUpperCase();
        System.out.println(messageTwo);// EU8 İS AWESOME!!

        String str= "abc";
        System.out.println(str.trim()); //abc
        str= str.trim();
        System.out.println(str);
      // can we also trim not the spaces before or after, but the one that is inside the text?
        String str2="abc cde ";



    }
}
