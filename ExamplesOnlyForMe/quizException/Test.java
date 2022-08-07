package quizException;

public class Test {
   static int a=50;

    public static void main(String[] args) {
        a=100;
        try{
            a=200;
        }catch (Exception e){
            a=300;
        }finally {
            a=400;
        }
        System.out.println(a);
    }
    static {
        a = 500;


/*
    public static void main(String[] args) {
        pause1();
     //   pause2();
    }

    public static  void  pause1(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void pause2() throws  InterruptedException{
        Thread.sleep(3000);
    }*/


    }}

