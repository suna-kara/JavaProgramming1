package week19;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<String> cities=new ArrayDeque<>();
        
        cities.add("Ankara");
        cities.addAll(Arrays.asList("Newyork","Athens","Washington","Brussels","Paris"));
        
        Queue<String> citiesLinkedList=new LinkedList<>();
        citiesLinkedList.addAll(cities);
        
        // These data structures works as FIFO: First in First out

        for (int i = 0; i < cities.size(); ) {
            //FIFO
         System.out.println(cities.poll());  // brings the heasd of the list and deletes

           // System.out.println(cities.peek());
            
        }

        System.out.println("cities.size() = " + cities.size());

        for (int i = 0; i < citiesLinkedList.size();) {
           //FIFO
            System.out.println(citiesLinkedList.poll());  // it did not required casting

        }
        System.out.println("citiesLinkedList = " + citiesLinkedList);

    }
}
