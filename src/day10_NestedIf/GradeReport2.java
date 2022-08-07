package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int s = 45;
        if (s >= 0 && s <= 100) {// if the score is valid
            // 5 possibilities: A, B, C, D, F

            if (s >= 90) {//false: score < 90
                System.out.println("Excellent");
            } else if (s >= 80) {// false: score<80
                System.out.println("Great");

            } else if (s >= 70) {// false: score < 70
                System.out.println("Good");
            } else if (s >= 60) {//false: score<60
                System.out.println("Passed");
            } else {
                System.out.println("Failed");

            }

        } else {//if the score is NOT valid
            System.out.println("Invalid Score");
        }
        System.out.println("............");
        //solution2: use ternaries ONLY
     String result=   (s >= 0 && s <=100)?   (s>=90)?"Excellent" :(s>=80)? "Great"
      :(s>=70)? "Good" : "Failed" :"Invalid Score";
        System.out.println(result);


        System.out.println(".......................");

        // solution3
        String  result2= "";
        if(s >= 0 && s <=100){

            result2= (s>=90)?"Excellent" :(s>=80)? "Great" :(s>=70)? "Good" :(s >= 60)?
                    "Passed" : "Failed";
        }else{// if the s is not valid
            result2 = "Invalid Score";
        }


    }
}
