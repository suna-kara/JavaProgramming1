package day33_static;

public class CydeoStudentTest {
    public static void main(String[] args) {
        CydeoStudent student1=new CydeoStudent("Jimmy",39,'C','M',14,8,5);
        System.out.println(student1);

       student1.printSchoolName();
       student1.printProgLanguage();
    }
}
