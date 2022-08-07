package day24_CustomMethods_Return;

public class _4_ReturnStatement {
    public static void main(String[] args) {
        nameOfDay(10);
    }

    public static void nameOfDay(int number) {

        //4. Create a method that can print the name of the day based on the given number to the method
        if (number < 1 || number > 7) {
            System.out.println("Invalid");
            return;//exits nameOfDay method
        }

        if (number == 1) {// if the number is invalid
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }


    }
}