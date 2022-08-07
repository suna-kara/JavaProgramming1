package day31_Constructors;

public class Person {
    public  String name;  //instance variable
    public  char gender; //instance variable
    public int age;       //instance variable

    public  Person(String name,char gender,int age){// constructor.. has 3 parameters
        this.name=name;
        this.gender=gender;
        this.age=age;


    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
