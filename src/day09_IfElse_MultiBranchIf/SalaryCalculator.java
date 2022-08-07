package day09_IfElse_MultiBranchIf;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary =75_000;
        boolean isMarried = true;
        double taxRate = 0;

        if(salary>=130000){
            taxRate= 0.35;//35%
        }else if(salary>=100000) {
            taxRate = 0.30;
        }else if(salary>=80000){
            taxRate=0.25;//25%

        }else {
            taxRate= 0.20;//%20
        }
        if(isMarried){// if the person is married
            taxRate = 0.5;//subtraction 5% from the original tax rate
        }
        double salaryAfterTax= salary - (salary*taxRate) ;
        System.out.println("Salary After Tax = " + salaryAfterTax);
    }
}
/*
Write a program that can calculate the salary after tax based on the following requirements
                   the tax rates are:
                   35% for salary of 130K or more
                   30% for salary of 100K to 130K (excluded)
                   25% for salarymof 80K to 100K (excluded)
                   20% for salary less than 80K
                   in addition, if the person is married, he/she will pay 5% less tax
 */