package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1=new Employee("Tahir",'M',28,110000);
      employee1.setAge(32);


  Employee employee2=new Employee("Tatiana",'F',25,110000);

  employee2.setName("Elvira");

  employee2.setSalary(employee2.getSalary()+1500);

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
