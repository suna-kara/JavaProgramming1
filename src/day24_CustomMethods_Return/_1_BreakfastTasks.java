package day24_CustomMethods_Return;

public class _1_BreakfastTasks {
    public static void main(String[] args) {

        initials("Cydeo","School");//C.S
        System.out.println("-------------------------------------");

        domain("Cydeo.School@amazon.com");

        System.out.println("---------------------------------");


String[] emails={"josh@gmail.com" , "Jim@yahoo.com" , "Elminur@cydeo.com" ,"Gulsen@gmail.com"};
domain(emails[0]);
for (String email : emails){
    domain(email);
}
        System.out.println("--------------------------------");
nameOfMonth(12);

        System.out.println("------------------------");

        nameOfDay(4);
        System.out.println("------------------------");
        DaysInMonth(30);

    }
    //1. Create a method that can display the initials of the person // ilk harf.   initials(String firstName,String lastName)
public static void initials(String firstName,String lastName){

        String initial=firstName.charAt(0)+"."+lastName.charAt(0);
        initial=initial.toUpperCase();
    System.out.println("initial = " + initial);











        }

//2. Create a method that can display the domain of the email.domain()tanım kümesi

    public  static void domain(String email){// Cydeo@gmail.com

        String domain=email.substring(email.indexOf("@")+1 , email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }


    //3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number){
        String name= "";

        if (number>=1 && number<=12){
            name =(number==1)?"Jan" :(number==2)? "Feb" :(number==3)? "March"
                    :(number==4)?"Apr" :(number==5)?"May" :(number==6)? "June" :(number==7)?
                    "July" :(number==8)?"Aug" :(number==9)? "Sep" :(number==10)?
                    "oct" :(number==11)? "nov" :"Dec" ;
        }else{
            name="Invalid";
        }
        System.out.println("Month name = " + name);
    }


    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        String name="";
        if (number>=0 && number<=7){
            name=(number==1)? "Mon" :(number==2)? "Tue" :(number==3)? "Wed" :(number==4)? "Thursday"
                    :(number==5)? "Fri" :(number==6)? "Sat" :"Sun" ;
        }else{
            name="Invalid";
        }
        System.out.println("Day name = " + name);
    }


    //5. Create a method that can print how many days a month has
    public static void DaysInMonth(int number){
        String name="";
        if (number==28 && number==30 && number==31) {
            name = (number == 30) ? "April,June,sept,nov" : (number == 31) ? "Jan,Mar,May,June,Aug,oct,Dec" : "Feb";
        }else{
            name="Invalid";
        }
        System.out.println("DaysIn Month name = " + name);
    }










}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person // ilk harf
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
                        */