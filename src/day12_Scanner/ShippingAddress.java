package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName=scan.nextLine();// Java ProgrammingEnter

        System.out.println("Enter your building number");
        String building =scan.next();
       scan.nextLine();// Enter
        System.out.println("Enter your street name:");
        String streeet=scan.nextLine();//Janes Branch DriveEnter

        System.out.println("Enter your city name:");
        String city = scan.nextLine();// McLean


        System.out.println("Enter your state name:");
        String state = scan.next();// VA


        System.out.println("Enter your zip code:");
        String zipCode= scan.next();//220012

        scan.nextLine();//EnterEnter

        System.out.println("Enter your country name:");
        String country= scan.nextLine();


scan.close();


    }
}
/*
1. Enter your full name()nextLine()
2. Enter your building number(next())
3. Enter your Street name(nextLine())
4.Enter your city name(nextLine())
5. Enter your state(next())
6. Enter your zip code(next())
 */