package day30_CustomClass;

public class Employee {

    public  String name;
    public  int id;
    public char gender;
    public  String jobTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }




    public  void  work(){
        System.out.println(jobTitle+" "+" is working");
    }




}
/*
/*
Employee Class:
		Attributes:öznitelik
			name, id, gender, jobTitle, salary, isFullTime(boolean)
		Actions:
			toString(): to be able to print each employee object
			setInfo(): to be able to set all the attributes
			work()...
 */
