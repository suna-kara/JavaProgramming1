package Examples;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //replace:

        String str="Wooden Spoon";
        str=str.replace("Wooden","golden");
        System.out.println(str);

        str=str.replaceFirst("o","x");
        System.out.println(str);

         str=str.replaceAll("o","z");
        System.out.println(str);

        System.out.println(".....................");

        //substring method():

        String str1="mike_smith@gmail.com";

    String firstName=str1.substring(0,str1.indexOf("_"));
        System.out.println("firstName = " + firstName);

        String lastName=str.substring(str1.indexOf("_")+1,str1.indexOf("@"));
        System.out.println("lastName = " + lastName);

        String domain=str1.substring(str1.indexOf("@")+1,str1.indexOf("."));
        System.out.println("domain = " + domain);

        String str2=str1.substring(1);
        System.out.println(str2);

        //repeat ():
        String str3= "Cydeo ";
        str3=str3.repeat(4);
        System.out.println(str3);

        //toLowerCase():

        String str4="WOODEN SPOON";
        str4=str4.toLowerCase();
        System.out.println(str4);

        // contains():

        String str5="Java is my favorite programming language";
        str5=str5.toLowerCase();

        boolean hasJava=str5.contains("java");
        System.out.println(hasJava); //true

        // equals() and equalsIgnoreCase()  method:

        String s1="Java";
        String s2="jAva";


        System.out.println(s1.equals(s2));// false

        System.out.println(s1.equalsIgnoreCase(s2));//true

   /*     Scanner scan=new Scanner(System.in);
        System.out.println("Split:");
        String split=scan.next();
        System.out.println("Number of people:");
        int person=scan.nextInt();
        System.out.println("Check amount:");
        double amount=scan.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality=scan.next();
        double tipPoor=0.05*amount;
        double tipFair=0.10*amount;
        double tipGood=0.15*amount;
        double  tipGreat=0.2*amount;
        double tipExcellent=0.25*amount;

        if(serviceQuality.equals("Poor")){
            String people= "&".repeat(person);
            System.out.println("Number of people entered: "+people);
            System.out.println("Total to pay: "+(amount+tipPoor));
            System.out.println("Total tip: "+tipPoor);
            System.out.println("Total per person: "+(amount+tipPoor)/person);
            System.out.println("Tip per person: "+tipPoor/person);}
        else if(serviceQuality.equals("Fair")){
            String people= "&".repeat(person);
            System.out.println("Number of people entered: "+people);
            System.out.println("Total to pay: "+amount+tipFair);
            System.out.println("Total tip: "+tipFair);
            System.out.println("Total per person: "+(amount+tipFair)/person);
            System.out.println("Tip per person: "+tipFair/person);}
        else if(serviceQuality.equals("Good")){
            String people= "&".repeat(person);
            System.out.println("Number of people entered: "+people);
            System.out.println("Total to pay: "+(amount+tipGood));
            System.out.println("Total tip: "+tipGood);
            System.out.println("Total per person: "+(amount+tipGood)/person);
            System.out.println("Tip per person: "+tipGood/person);}
        else if(serviceQuality.equals("Great")){
            String people= "&".repeat(person);
            System.out.println("Number of people entered: "+people);
            System.out.println("Total to pay: "+(amount+tipGreat));
            System.out.println("Total tip: "+tipGreat);
            System.out.println("Total per person: "+(amount+tipGreat)/person);
            System.out.println("Tip per person: "+tipGreat/person);}
        else if(serviceQuality.equals("Excellent")){
            String people= "&".repeat(person);
            System.out.println("Number of people entered: "+people);
            System.out.println("Total to pay: "+(amount+tipExcellent));
            System.out.println("Total tip: "+tipExcellent);
            System.out.println("Total per person: "+(amount+tipExcellent)/person);
            System.out.println("Tip per person: "+tipExcellent/person);}
        else {
            System.out.println(" ");
        }
        */

    }
    }

