package day31_Constructors;

public class RectangleObjects {
    public static void main(String[] args) {

     Rectangle rectangle1=new Rectangle(5.5,3.5);
     Rectangle rectangle2=new Rectangle(10.5,8.5);

        System.out.println(rectangle1);
        System.out.println(rectangle2);



    }
}

/*
create a custom class named Rectangle
    Attributes:
        length, width
    Add a constructor that can set all the fields
    Actions:
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
     	toString(): displays the width, length, area and perimeter of the rectangle when an object of rectangle passed in the print statement
 */