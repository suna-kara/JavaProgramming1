package day41_ExceptionIntro;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlock {
    public static void main(String[] args) {
        Employee employee=null;

        try {
            System.out.println(employee.getSalary());  // Null pointer Exception

    }catch (NullPointerException e) {
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Secnd catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){ // parent class olg için child class lardan sonra yazılmalı
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }

        System.out.println("Tested Completed");

        System.out.println("-------------------------------------------");
   try {
       System.out.println("Java".charAt(-1));
   }catch(RuntimeException e){
      e.printStackTrace();
   }


































    }
}
