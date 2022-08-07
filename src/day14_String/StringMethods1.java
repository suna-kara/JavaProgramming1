package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str= "            batch 25          ";
        str=str.trim();  //"batch 25"
        System.out.println("str = " + str);

        String str1= "Cydeo School";
        int n1=str1.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2=str1.indexOf("ool");//9
        System.out.println("n2 = " + n2);

        String str2="Java Programming language";

        int n3=str2.indexOf("a");//1
        System.out.println("n3 = " + n3);

        int n4=str2.indexOf("a ");// second a,3
        System.out.println("n4 = " + n4);

        int n5=str2.indexOf("amm");//3. a=10
        System.out.println("n5 = " + n5);

        int n6=str2.indexOf("an");
        System.out.println("n6 = " + n6);//fourth a=18

        int n7=str2.indexOf("age");
        System.out.println("n7 = " + n7);//5. a=22

        int n8=str2.indexOf("g");
        System.out.println("n8 = " + n8);

        int n9=str2.indexOf("g ");
        System.out.println("n9 = " + n9);// second g=15


        int n10=str2.lastIndexOf("g");
        System.out.println("n10 = " + n10);// last g=23

        System.out.println("----------------");

        String s= "Java Nova Cava Wawa orange";
        int firstA=s.indexOf("a");
        int lastA=s.lastIndexOf("a");
        int secondA=s.indexOf("a ");
        int thirdA=s.indexOf("a C");

       //int fourthA=s.indexOf("ava W");
       // int fourthA=s.lastIndexOf("av");
        int fourthA=s.indexOf("Ca") + 1;

        //int fifthA=s.lastIndexOf("va") + 1;
        int fifthA=s.lastIndexOf("a W");

        int sixthA=s.lastIndexOf("aw");

       // int seventhA=s.indexOf("a o");
        int seventhA=s.lastIndexOf("a ");



        System.out.println("firstA = " + firstA);

        System.out.println("lastA = " + lastA);

        System.out.println("secondA = " + secondA);

        System.out.println("thirdA = " + thirdA);

        System.out.println("fourthA = " + fourthA);

        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);

        System.out.println("seventhA = " + seventhA);

    }
}
