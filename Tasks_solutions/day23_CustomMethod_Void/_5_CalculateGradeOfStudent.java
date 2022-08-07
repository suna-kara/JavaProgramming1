package day23_CustomMethod_Void;

public class _5_CalculateGradeOfStudent {
    public static void main(String[] args) {
        grade(87);


    }


    public  static void  grade(int score){

        String grade="Invalid";
        if (score >=0 && score<= 100){
            grade=(score >= 90)? "A":(score>=80)? "B" :(score>=70)? "C":(score>=60)? "D": "E";
        }
        System.out.println("grade = " + grade);
    }












}
