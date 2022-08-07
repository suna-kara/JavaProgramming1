package day28_ArrayList;

import java.util.ArrayList;

public class _5_ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {  // i: index number of list
            list.set(i,list.get(i) * 2);

        }
        System.out.println(list);


        System.out.println("---------------------------");

        ArrayList<String> employees=new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(employees.size()-1);
        System.out.println(employees);


     boolean r1=   employees.remove("Hulya");

        System.out.println(employees);


        employees.remove(employees.size()-1);
        System.out.println(employees);

      boolean r2=  employees.remove("Neira");

        System.out.println(employees);

        System.out.println("r2 = " + r2);
        System.out.println("r1 = " + r1);

    }
}
/*
{1,2,3,4,5,6}

{2,4,6,8,10,12}
 */