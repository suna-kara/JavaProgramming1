package day23_CustomMethod_Void;

public class _11_PositiveNegativeZero {
    public static void main(String[] args) {
        posNegZero(-89);
    }
    //12. create a method that can if the given integer is positive,
    //         negative or zero

    public static void posNegZero(int number){
        String result=(number > 0)? "Positive" : (number<0)? "Negative" : "Zero";
        System.out.println(result);
    }


}
