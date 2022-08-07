package day21_ForEachLoop;

public class _5_AvarageNumber {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50,60};
        double sum=0;//10+20+30+...
        for (int number: numbers) {
            sum +=number;

        }

        double averageNumber=sum/ numbers.length;
        //10/3===>3
        System.out.println("averageNumber = " + averageNumber);


    }
}
