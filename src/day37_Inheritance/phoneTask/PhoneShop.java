package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone=new Iphone("Iphone 12","6.7 inches",1000,"Black");
        Samsung samsung=new Samsung("galaxy s19","6 inches",900,"White");
        Nokia nokia=new Nokia("Brick", "4 inches",50,"Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

  iphone.call(911);
  iphone.text(123456789);
  iphone.faceTime("yahoo@gamil.com");
  iphone.faceTime(789456123);

        System.out.println("---------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();
        System.out.println("-----------------------");

        nokia.call(432109876);
        nokia.selfDefense();

        System.out.println("----------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);

    }







}
