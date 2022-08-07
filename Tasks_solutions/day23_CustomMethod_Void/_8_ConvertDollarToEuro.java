package day23_CustomMethod_Void;

public class _8_ConvertDollarToEuro {
    public static void main(String[] args) {
        dollarToEuro(7400);
    }
    // 9. create a method that can convert dollar to euro

    public static void dollarToEuro(double dollarAmount){
        double euro=dollarAmount * 0.85;
        System.out.println(dollarAmount+" dollar equal to "+euro+" euro ");
    }

}
