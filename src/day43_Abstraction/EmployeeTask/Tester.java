package day43_Abstraction.EmployeeTask;

public final class Tester extends  Employee{


    public Tester(String name, int age, char gender, int id, String sdet, double v) {
        super(name, age, gender, id);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing the app");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 8 hours");
    }

    public void bugReport(){
        System.out.println(getName()+" is creating bug reports");
    }



}
