package day23_CustomMethod_Void;

public class _13_EachElement {
    public static void main(String[] args) {
        eachElement(new int[] {2,3,5});

    }
    //14. create a method named printEachElement that can print each
    //         elements of an integer array

    public static void eachElement(int[] numbers){

        for (int each : numbers) {
            System.out.println(each+" ");
        }
    }




}
