package day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        //substring(beginning index, ending index)

        String word = "Cydeo School";
        //             012345....
        String brand=word.substring(0 , 4+1);
        System.out.println(brand);
        String str1= word.substring(6);
        System.out.println(str1);



        String word2="Java Programming Language";
        String s1 =word2.substring(0,word2.indexOf(" "));//"Java"

        String s2=word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" ")); //Programming
        String s3=word2.substring(word2.lastIndexOf(" ")+1);
        // String brand

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("------------------");


        String word3="Phyton C# Ruby";
        String s4 =word3.substring(0,word3.indexOf(" "));//"Phyton"

        String s5=word3.substring(word3.indexOf(" ")+1, word3.lastIndexOf(" ")); //C#
        String s6=word3.substring(word3.lastIndexOf(" ")+1);//Ruby
        // String brand

        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);








    }
}
