package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number= 101;
     /*....*/
        boolean evenNumber = number%2 == 0;
        boolean oddNumber = ! evenNumber; //not even number
        if(evenNumber){//false
            System.out.println(number+" is even number");
        if(oddNumber){//true
            System.out.println(number+" is odd number");
        }




        }
        if(!evenNumber){ // not even number
            System.out.println(number+" is not even number");
        }
        System.out.println("......................");
        int n = 200;

        // positive
        if(n > 0){
            System.out.println(n+" is positive");
        }

        // negative
        if(n < 0){
            System.out.println(n+" is negative");

        }
        // zero
        if(n == 0){
            System.out.println(n+" is zero");

        }



    }



}
