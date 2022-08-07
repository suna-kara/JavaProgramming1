package week2;

public class CustomMethodsExample {

    public static void main(String[] args) {

        int sum;
        sum=add(5,6);

        double sumTwo=add(5.5,6.5);

        // double sumThree=(5.5,5); this one is calling void method, it does not return anything
    }
    // create a static public custom method that adds two numbers

    public static int add(int x,int y){

        return  x + y;
    }
    public static void add(double x,int y){

        System.out.println(x+y); // the action is just printing, However in real life our void methods
       // will open browser, do some
    }
public static double add(double x,double y){ // same name with diff parameters

return x+y ;
}

// for different implementation of the same method :
// we cam overload our method. How? Same name with different parameters.
   // ( we don't care about return type)









}
