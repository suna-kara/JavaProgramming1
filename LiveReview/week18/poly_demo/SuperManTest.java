package week18.poly_demo;

public class SuperManTest {
    public static void main(String[] args) {

        /*
        İmportant NOTE:
         */

        //polymorphism
        //Interface/Parent class RN=ChildClass

        Parent superManOne=new Father();  // you can reach Parent Abstarct Class Methods but CAN NOT reach worker Interface methods

        superManOne.feedKid();
        superManOne.playWithKid();
        superManOne.raiseKid();


      //  superManOne.work("SDET"); // ERROR superManOne is type of Parent Abstract Class


        Worker superManTwo=new Father(); // you can reach Worker Interface Methods but CAN NOT reach Parent Abstract Class methods
        superManTwo.getPaid();
        superManTwo.work("SDET");

        Father superManThree=new Father();
        superManThree.feedKid();
        superManThree.getPaid();
        superManThree.playWithKid();
        superManThree.raiseKid();
        superManThree.work("QA");

        boolean b1=superManOne instanceof Father;
        boolean b2=superManTwo instanceof Father;
        boolean b3=superManThree instanceof  Father;

        System.out.println("b3 = " + b3);
        System.out.println("b2 = " + b2);
        System.out.println("b1 = " + b1);


        // Up-Casting Examples
        ((Worker)superManOne).work("Engineer");
        ((Worker)superManOne).getPaid();

        ((Parent)superManTwo).raiseKid();
        ((Parent)superManTwo).playWithKid();
        ((Parent)superManTwo).feedKid();




    }
}
