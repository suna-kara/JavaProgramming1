package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {
        // lenght, width, area, perimeter
        double lenght = 5.5;
        double width = 10.5;
        double area = lenght * width;
        double perimeter = 2 * (lenght + width);
        System.out.println("lenght = " + lenght);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
/*
1. Create a class named Square, write a program that can calculate the area & perimeter of any giver squre side
         area = lenght * width
         perimeter = 2 * (lenght + width)
 */