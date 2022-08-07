package day43_Abstraction.EmployeeTask;

public final class Driver extends  Employee{


    public Driver(String name, int age, char gender, int id, String lyft_driver, double v) {
        super(name, age, gender, id);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 10 hours");
    }
}
