package day09_IfElse_MultiBranchIf;

public class NameOfDay {
    public static void main(String[] args) {
        int n = 1; // 1 ~ 7
        String day;

        if (n == 1) {
           day = "Monday";
        } else if (n == 2) {
            day = "Tuesday";
        } else if (n == 3) {
           day = "Wednesday";
        } else if (n == 4) {
           day = "Thursday";
        } else if (n == 5) {
          day = "Friday";
        } else if (n == 6) {
          day = "Saturday";
        } else {
           day = "Sunday";
        }
        System.out.println("day = " +day); {

        }
    }
}