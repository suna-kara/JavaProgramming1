package day40_FinalKeyword;

public class FinalVariable {
    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    final String birthDay;
    final static  String name;

   static {
       name="Batch 25";
    }

    public static void main(String[] args) {
       // double pi=3.14; // local variable

        // local variables in java=instance variable



        final double pi=3.14;

     //   pi=4.14; // final variables can not be reassigned

        final String name;
           name="Java";
     //   name="Wooden Spoon"; final variable sadece bir defa yazılır. yazılan gecerlidir. diğerleri gecerli olmaz

        System.out.println(name);
        System.out.println(pi);

        System.out.println("************************");

            FinalVariable obj=new FinalVariable("May/01");
           // obj.birthDay="June/6"; //final variables can nor reassigned
        System.out.println(obj.birthDay);

        System.out.println("************************--------------------------");

      //  FinalVariable.name="Phyton";
        System.out.println(FinalVariable.name);






    }
}
