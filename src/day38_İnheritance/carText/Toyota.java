package day38_İnheritance.carText;

public class Toyota extends  Car {


    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public  void reliable(){
        System.out.println(brand+ " "+model+ " is reliable");
    }
    public void start(){
        System.out.println();
    }

}

/*
1. Toyota:
					extra methods:
							reliable()
 */