package day24_CustomMethods_Return;

public class _7_REturnMethodPractice2 {
    public static void main(String[] args) {


        //create a function that can calculate the grade
String str1=grade(95);

        /*
            check the grade:
                'A' ====> Excellent
                'B' ====> Great
                .....
         */

        if (str1.equals("A")){
           str1=(str1.equals("A"))?"Excellent":(str1.equals("B"))? "Great":(str1.equals("B"))?
                   "Good":(str1.equals("BB"))? "Passed" :"Try Again";
            System.out.println(str1);
        }
    }

    public static String grade(int score){
        String result="";
        if (score<0 || score>100){
            result="Invalid";
        }else{
            result=(score>=90)? "A" :(score>=80)? "B" :(score>=70)? "C" :(score>=60)? "D" : "F";


        }
        return result;
    }





















}
