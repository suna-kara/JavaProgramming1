package day43_Abstraction.EmployeeTask;

public final class Teacher extends Employee {

    public Teacher(String name, int age, char gender, int id, String english_teacher, double v) {
        super(name, age, gender, id);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping 8 hours");
    }
}
