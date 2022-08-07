package week05;

import java.util.Locale;
import java.util.Scanner;

public class EmailExampleFromReplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid email: craig_federighi@apple.com ");
        String email= input.next();


        int indexof_=email.indexOf("_");
        int indexofAtSign= email.indexOf("@");
        int indexOfDot= email.indexOf(".");

        String firstName= email.substring(0,indexof_);
        firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);

        String lastName= email.substring(indexof_+1,indexofAtSign);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        //lastName.substring(0,1) : it is my first characterbat the last name word
        System.out.println("lastName = " + lastName);



    }
}
