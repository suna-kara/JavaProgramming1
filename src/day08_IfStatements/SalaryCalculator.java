package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
       int hourlyRate = 50,
            weeklyHours = 40;
         double   stateTaxRate =  0,
                 federalTaxRate = 26.2;
         //....................................
                int salaryBeforeTax= hourlyRate * weeklyHours * 52;
                double stateTax=salaryBeforeTax * stateTaxRate / 100;
                double federalTax = salaryBeforeTax * federalTaxRate / 100;
                double totalTax = stateTax + federalTax;
                double salaryAfterTax = salaryBeforeTax - totalTax;


                //....................................

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("stateTax is: $" + stateTax);
        System.out.println("federalTax: $" + federalTax);
        System.out.println("totalTax is: $" +totalTax);
        System.out.println("salaryAfterTax is: $" +salaryAfterTax);












    }
}
/*
create a class called SalaryCalculator.java
1 declare the following variables:
hourlyRate, weeklyHours, stateTaxRate, federalTax
2. use the given info in above variables to calculate the followings:
                  1.salaryBeforeTax
                  2.stateTax
                  3. federalTax
                  4. totalTax
                  5. salaryAfterTax
 */