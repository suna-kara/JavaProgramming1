package week19;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        // Set Does NOT  duplicates: helps you to implement some coding algorithms

        String str="zzzzzzzzoooooooaaaabbbcccccddddeeeeee";  // str to char array
        List<String> listOne=new ArrayList<>();
        listOne.addAll(Arrays.asList(str.split("")));
        System.out.println("listOne = " + listOne);

        Set<String> stringSet=new LinkedHashSet<>();  // to keep my insertion
        stringSet.addAll(listOne); // What will happens at this line, duplicates are removed

        System.out.println("stringSet = " + stringSet);

        stringSet.add(null);
        System.out.println("stringSet after adding null = " + stringSet);

        Set<String> hashSet=new HashSet<>();   //  İf we don't need any kind of order we can go ahead with HashSet,we can put one null value
        hashSet.addAll(listOne);
        System.out.println("stringSet1 = " + hashSet);
        hashSet.add("g");
        hashSet.add("null");
        System.out.println("stringSet1 = " + hashSet);

     Set<String> treeSet=new TreeSet<>();   // Orders the
        treeSet.addAll(listOne);
        System.out.println("stringSet2 = " + treeSet);


    }
}
