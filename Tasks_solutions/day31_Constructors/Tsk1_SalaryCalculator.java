package day31_Constructors;

public class Tsk1_SalaryCalculator {

    public double  hourlyRate, stateTaxRate,
            federalTaxRate;
    public int weeklyHours;

    public Tsk1_SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return  weeklyHours * hourlyRate * 52;
    }
    public double stateTax(){
        return  salary()*stateTaxRate;

    }
    public double federalTax(){
        return salary() * federalTaxRate;

    }
    public double salaryAfterTax(){
        return salary()- stateTax()- federalTax();
    }

    public String toString() {
        return "Tsk1_SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salary= $" + salary() +
                ", state tax= $" + stateTax() +
                '}';
    }
}
/*
 1. SalaryCalculator Task:
  1.1 Create a class named Salary calculator:
          Attributes:
              hourlyRate, stateTaxRate,
  federalTaxRate, weeklyHours
              Add a constructor to set all the fields
          Actions:
              salary(): calculates the salary (
  hourlyRate * weeklyHour * 52)
              stateTax(): calculates the
  totalStateTax
              federalTax(): calculates the
  total federal tax
              salaryAfterTax(): calculates the
  salary after tax
              toString(): displays the salary,
  stateTax, federalTax, salaryAfterTax of the Object
 */