package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setİnfo("Aygün",'F',39,2210,'A');

        Student student2=new Student();
        student2.setİnfo("Hulya",'M',34,2212,'B');


        Student student3=new Student();
        student3.setİnfo("Ali",'F',40,2213,'C');

        Student student4=new Student();
        student4.setİnfo("Mert",'M',26,2215,'A');

Student[] students={student1,student2,student3,student4};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("---------------------------");

        ArrayList<Student> earlyBirds=new ArrayList<>();
        ArrayList<Student> angryBirds=new ArrayList<>();

        for (Student student : students) {
            if (student.grade=='A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);

    }
}
