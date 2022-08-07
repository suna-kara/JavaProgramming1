package week12;

import day30_CustomClass.Employee;

public class LR1_Employee {

    public String name, jobTitle;
    public int ID;
    public double salary;

    public LR1_Employee(){
        // no parameter constructor

    }

   public LR1_Employee(String name,String jobTitle,int ID,double salary) {
        this.name=name;  // I am getting a name from constructor and assigning it to the field of the object that I am creating
       this.jobTitle=jobTitle;
       this.ID=ID;
       this.salary=salary;

    }

    public String asString() {   // asString==toString
        return "LR1_Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                '}';
    }
}
/*
Employee:
    attribute
        name, jobTitle, ID, salary

    add a constructor to initialize all the fields

    toString()
 */