package week10;

public class R05_MethodOverLoading {
    public static void main(String[] args) {

        //Height: 5 feet 11 inches

        System.out.println(convertBritishToMetric(5.0,11.0));

        //Height:71 inches

        System.out.println(convertBritishToMetric(71));


        String str="Java is fun";

        System.out.println(str.substring(3,5));  // there is method overloading

        System.out.println(str.substring(3));



    }

    // Requirement : I will as parameter either inches or inches and feet together ----> return value in centimeters

    public  static  double convertBritishToMetric(double feet, double inches){
        // 1 feet=12 inches
        if (feet<0 || inches<0 || inches> 12){
            System.err.println("Invalid feet or inches");

          return  -1.0;


        }


        return feet*12*2.54 + inches*2.54;
    }

    public  static double convertBritishToMetric(double inches) {
        if (inches < 0 ) {
            System.err.println("Invalid feet or inches");
            return -1.0;

        }
        return inches * 2.54;


    }

    /*
    public  static int converBritishToMetric(double x,double y){
    }

    it is not considered as method overloading, just return type changed, JAVA compiler is complining
    */














}
