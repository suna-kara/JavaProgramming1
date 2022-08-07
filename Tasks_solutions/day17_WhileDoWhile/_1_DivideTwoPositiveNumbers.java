package day17_WhileDoWhile;

public class _1_DivideTwoPositiveNumbers {
    public static void main(String[] args) {
        int num1=46,num2=4;

        int count=0;
        while (num1>=num2){
            num1 -=num2;
            count++;
        }

        System.out.println(count+" with a remainder of "+num1);
    }
}
