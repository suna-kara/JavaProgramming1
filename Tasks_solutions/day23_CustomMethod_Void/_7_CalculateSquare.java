package day23_CustomMethod_Void;

public class _7_CalculateSquare {

    public static void main(String[] args) {
        areaOfSquare(8);
    }
    //7. create a method that can calculate the area of a square

    public static void areaOfSquare(double side){
        double area= side * side;
        System.out.println("area = " + area);
    }
}
