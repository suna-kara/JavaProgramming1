package day23_CustomMethod_Void;

public class _6_CalculateCircle {

    public static void main(String[] args) {
        areaOfCircle(5);
    }
    //6. create a method that can calculate the area of a circle

    public static void areaOfCircle(double radius){
        double area=radius * radius *3.14;
        System.out.println("area = " + area);
    }


}
