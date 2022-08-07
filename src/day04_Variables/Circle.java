package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        //PI, radius, diameter,area, perimeter

        double radius = 10;
      double PI = 3.14;
        double diameter = radius * 2; //finds the diometer
        double area = radius * radius * PI; //finds the area of the circle
        double perimeter = diameter * PI; //finds the perimeter of the circle
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("diameter = " + diameter);
        System.out.println("PI = " + PI);
        System.out.println("radius = " + radius);

    }
}
/*
1. Create a class named Circle, write a program thatncan calculate the area & perimeter of any giver Circle
        area = radiıs * radius * PI
        Perimeter = 2 * radius * PI
 */