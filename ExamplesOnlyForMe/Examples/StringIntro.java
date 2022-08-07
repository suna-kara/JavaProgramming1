package Examples;

public class StringIntro {
    public static void main(String[] args) {

    String str="Java";
    String str1= "Java";
    String str2= "Java";

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str==str1);
        System.out.println(str==str2);
        System.out.println(str1==str2);

        System.out.println("------------------");
        String s1= new String("Java");

        String s2= new String("Java");
        String s3=new String("Java");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1==s2);

        System.out.println("--------------");
        String name= "wooden spoon";// immutable
        name=name.toUpperCase();//WOODEN SPOON

        System.out.println(name);
        System.out.println("-----------------");

        String str3= "Wooden Spoon";
        int n1=str3.length();
        System.out.println("n1 = " + n1);
        int lastIndex =str3.length()-1;
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("********************");

        // toLowerCase: returns the all lower case version of the String.return type ---> String

        String str4= "Java";
        str4=str4.toLowerCase(); // java
        System.out.println(str4);
        System.out.println("-----------------");
        // toUpperCase:
        String str5= "Java";
        str5=str5.toUpperCase();
        System.out.println(str5);
        System.out.println("****************");

        String str6= "            Java   programming  Language     ";
        str6=str6.trim();
        System.out.println(str6);

        System.out.println("................");

        String str7= "Wooden Spoon";
        int indexNumOfFirsto= str7.indexOf("o");
        System.out.println("indexNumOfFirsto = " + indexNumOfFirsto);

         int indexNumberOfSecond=str7.indexOf("od");
        System.out.println("indexNumberOfSecond = " + indexNumberOfSecond);

        int indexNumberOfThirdo=str7.indexOf("oon");
        System.out.println("indexNumberOfThirdo = " + indexNumberOfThirdo);

       int indexNumberOfFourtho=str7.indexOf("on");

        System.out.println("indexNumberOfFourtho = " + indexNumberOfFourtho);

        System.out.println("****************");

        String str8= "Wooden Spoon";
        int indexNumOfLasto=str8.lastIndexOf("o");
        System.out.println("indexNumOfLasto = " + indexNumOfLasto);







    }

}
