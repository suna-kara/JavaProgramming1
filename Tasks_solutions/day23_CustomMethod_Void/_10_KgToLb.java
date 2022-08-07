package day23_CustomMethod_Void;

public class _10_KgToLb {
    public static void main(String[] args) {
        kgToLb(45);
    }
    // 11. create a method that can convert kg to lb
    public static void kgToLb(double kg){
        double lb= kg * 2.205;
        System.out.println(kg+" kg equal to "+lb+" lb ");
    }
}
