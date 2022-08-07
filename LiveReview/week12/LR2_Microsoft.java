package week12;

public class LR2_Microsoft {

    public static void main(String[] args) {

        String[] arr={"ab","cv","ed"};

        LR1_Employee employee1=new LR1_Employee();
        // employee---> is just a reference

        System.out.println(employee1.asString());
        employee1.name="Emir";
        employee1.jobTitle="Product Owner";
        employee1.ID=100;
        employee1.salary=250000;

        System.out.println(employee1.asString());



        LR1_Employee[] testers={
                new LR1_Employee("Yasin","SDET",123,150000),
                new LR1_Employee("Rumeysa","QA engineer",232,12000),
              new LR1_Employee("Erol","QA lead",101,170000),
                new LR1_Employee("Dilek","SDET",134,155000)
        };

        // lets find max salary

        double maxSalary=Double.MIN_VALUE;

        for (LR1_Employee each : testers) {
            System.out.println(each.asString());

            // each is areference for our obj created inside the array

            if (each.salary>maxSalary)
                maxSalary= each.salary;
        }
        System.out.println("maxSalary = " + maxSalary);
    }


}
