package week04;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        double totalPrice = 20.0;
        if (totalPrice >= 25.0) {
            System.out.println("FREE Shipping eligible.your order total : $ " + totalPrice);

        } else {
            System.out.println("NOT Eligible for free shipping : $ " + totalPrice);

        }
        System.out.println("Thanks for shopping with us ! ");
    }
}
