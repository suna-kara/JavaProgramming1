package day38_İnheritance.carText;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("camry",2020,20000,"Gray",123456);
        Tesla tesla=new Tesla("Model S", 2022, 94990, "Red", 0);
       BMW bmw=new BMW("X5", 2020, 67350, "black", 1200);

       toyota.start();
       tesla.start();
       bmw.start();


    }
}
