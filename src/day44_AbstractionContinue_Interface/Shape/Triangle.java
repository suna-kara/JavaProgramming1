package day44_AbstractionContinue_Interface.Shape;

public class Triangle extends  Shape{
    public Triangle(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
