package ForLoops;

public class Fibonacci {
    public static void main(String[] args) {
        // Fibonacci:
        // 1 1 2 3 5 8 13 21
        // a b c
        //   a b c
        //     a b c

        int num1=0;
        int num2=1;
        int sum;

        String series=""+num1 +" " +num2+" ";

        for (int i = 2; i <=11 ; i++) {
            sum=num1+num2;
            num1=num2;
            num2=sum;
            series +=sum + " ";
        }

        System.out.println(series);






    }
}
