package day23_CustomMethod_Void;

public class _14_Calculator {

    public static void main(String[] args) {
        calculator(15,10,'+');
    }


    //15. create a method named calculator that passes three arguments
    //         (num1, num2, mathOperator), prints the calculation result

    public static void calculator(double num1 ,double num2 , char operator){
        String result="Invalid";
        if (operator=='-' || operator=='+' || operator=='*' || operator=='/'){

            if (operator=='-'){
                result="Subtruction:  "+(num1 - num2);

            }else if (operator=='+'){

                result=" Addition: "+ (num1 + num2);

            }else if (operator=='*'){
                result=" Multiplication "+ (num1 * num2);

            }else{
                result=" Division "+ (num1 / num2);
            }
        }
        System.out.println(result);
    }


}
