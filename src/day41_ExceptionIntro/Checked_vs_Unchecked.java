package day41_ExceptionIntro;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class Checked_vs_Unchecked {
  public static void main(String[] args){

      // unchecked expection

    int a=10;
    int b=0;

     // System.out.println( a / b);

     // System.out.println("Wooden Spoon");

 char[] characters={'A','B','C'};
 //                  0,  1,   2

    //  System.out.println(characters[99]);

      //Student student=null;
     // System.out.println(student.getName());

     // student.study();

    final String str="Wooden Spoon";
   //  str=null;// null is not a object

    //  System.out.println(str.toUpperCase());

         String str2=" " ; //null != object

      System.out.println(str2.isEmpty());


      // Checked Exception:

      System.out.println("hello");

     //  Thread.sleep(3000);  //checked

      System.out.println("Cydeo");

    //  FileInputStream file=new FileInputStream("path of the file");

      System.out.println("Java".charAt(1000));  // unchecked


      Map<Integer,String> map=new HashMap<>();
      map.put(1,"a");
      map.put(2,"b");
      map.put(3,"c");
      map.put(4,"d");












  }



}
