package day44_AbstractionContinue_Interface.AnimalTask;

public interface Playable {

    static boolean isFriendly=true; // static & final by default
/*
    public  static void  method1(){
        System.out.println(isFriendly);
    }
    */
     void  play();  // abstract by default

}
