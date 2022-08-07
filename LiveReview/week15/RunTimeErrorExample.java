package week15;

import java.util.Scanner;

public class RunTimeErrorExample {
    public static void main(String[] args) {
        System.out.println("Hello");
        int x=5;
        Scanner scan=new Scanner(System.in);
        int y= scan.nextInt();
        // if there is a line that I might get exception expectation


        try{
            System.out.println(5/0);
        }catch (Exception e){

        }


        System.out.println("How are you today");
        System.out.println("Some more lines of code");


    }
}
