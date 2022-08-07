package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourly Rate,weeklyHours

        int weeklyHours = 45;
        int hourlyRate = 65;
        int numberOfWeeks = 52;
        int salary = hourlyRate * weeklyHours * 52;
       // System.out.println(salary);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = $" + salary); }
}
