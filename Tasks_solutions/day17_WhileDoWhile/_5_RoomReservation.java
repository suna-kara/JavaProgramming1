package day17_WhileDoWhile;

import java.util.Scanner;

public class _5_RoomReservation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Would you like to reserve a room? ");
        String answer= scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid answer,re enter");

            answer= scan.next().toLowerCase();
        }
   if (answer.equals("yes")){
       System.out.println("King bed==> $120\n"+"\tQueen bed==> $100\n"+"\tsingle bed==> $80");
   }else{
       System.out.println("Have a nice day");
   }

scan.close();


    }
}
/*
5. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)
	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$
            the program should be able to display the room he/she reserved and total price of the room.
            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */