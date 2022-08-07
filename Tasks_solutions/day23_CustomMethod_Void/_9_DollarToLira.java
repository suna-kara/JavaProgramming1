package day23_CustomMethod_Void;

public class _9_DollarToLira {
    public static void main(String[] args) {
        dollarToLira(7400);
    }
    //10. create a method that can can convert dollar to lira

    public static void dollarToLira(double amountdollar){
        double lira= amountdollar * 14.82;
        System.out.println(amountdollar+" dollar equal to "+lira+" lira ");
    }
}
