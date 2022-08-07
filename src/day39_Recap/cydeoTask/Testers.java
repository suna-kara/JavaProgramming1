package day39_Recap.cydeoTask;

public class Testers extends  Employee{

    public Testers(String name, int age, char gender,
                   int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    private  void createTicket(){
        System.out.println(getJobTitle()+ " " +getName()+ " is creating ticket");

    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+ " "+getName()+" is testing");
    }
}
