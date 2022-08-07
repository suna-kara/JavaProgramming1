package Loops;

import java.util.Scanner;

public class _2_Party {
    /*
    Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guestList="";

        while(true){
            System.out.println("Please enter guest name:");
            String guestName=input.nextLine();
            guestList +=guestName+",";

            System.out.println("Do you want to enter new guest name:");
            String a=input.nextLine().toLowerCase();

            while (!(a.equals("yes")|| a.equals("no"))){
                System.err.println("Invalid Entry, please re-enter");
                a=input.nextLine().toLowerCase();
            }
            if (a.equals("no")){
                System.out.println("Guest's list: "+guestList.substring(0,guestList.length()-2));
                break;
            }

        }


    }
}
