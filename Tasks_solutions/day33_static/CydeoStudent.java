package day33_static;

public class CydeoStudent {
    public String name;
    public int age;
    public char grade, gender;
    public int İD;
    public int batchNumber, groupNumber;

    public static String schoolName="Cydeo School";
    public  static  String programmingLanguage="Java";

    public CydeoStudent(String name, int age, char grade, char gender, int İD, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.gender = gender;
        this.İD = İD;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public  void study(){
        System.out.println(name+" is studying");
    }
    public  void attendClass(){
        System.out.println(name+" is attending class");
    }

public static void printSchoolName(){
    System.out.println("schoolName = " + schoolName);

}
public static void  printProgLanguage(){
    System.out.println("programmingLanguage = " + programmingLanguage);
}

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", gender=" + gender +
                ", İD=" + İD +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
1. Create a class named CydeoStudent:
  Attributes:
    instances: name, age,  gender, id, grade, batchNumber, groupNumber
  statics: schoolName, programmingLanguage
  Add a constructor that can set All the  fields (instances)
  Actions:
  study() attendClass()
  printSchoolName(): displays the school name
  printProgLanguage():  displays the name of programming language
  toString()

 */