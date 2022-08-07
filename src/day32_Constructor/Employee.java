package day32_Constructor;

public class Employee {

    public String name;
    public  char gender;
    public  String jobTitle;
    public double salary;



  public Employee(String name){
 //     this("Daniel",'M'); //One constructor can not call more than one constructor
        this.name=name;
    }

    public Employee(String name,char gender){

        this(name); // this.name=name;
       // Employee(name);   compile error because cConstructor can not be called by its name ( this()
        //      need to be used )

        this.gender=gender;
    }

    public Employee(String name,char gender,String jobTitle){
      this(name,gender);
      this.jobTitle=jobTitle;
    }



    public Employee(String name,char gender,String jobTitle,double salary){

    this(name,gender,jobTitle);
   this.salary=salary;

/*        this.name=name;
        this.gender=gender;
        this.jobTitle=jobTitle;
        this.salary=salary;*/

}

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

/*
    public void  method1(){
        System.out.println("method1");
    }


public void method2(){

}*/

 /* public void  method1(){
      this(name:"Aaron");      Only a constructor can call another constructor
  }*/



}
