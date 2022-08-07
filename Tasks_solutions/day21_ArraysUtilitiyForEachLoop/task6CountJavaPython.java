package day21_ArraysUtilitiyForEachLoop;

public class task6CountJavaPython {
    public static void main(String[] args) {
        /*
        6. Write a program that can return the number of appearances of
âjavaâ and âpythonâ anywhere in the sentence.
(similar to the task 97 in repl.it, but
this time you MUST use arrays and for each loop)
         */
String str="Java,Cydeo,python, Wooden Spoon,Birds,Java,Python,java,Java,java";
String[] words=str.split(",");

int python=0;
int java=0;
for (String  each: words){
    if (each.equalsIgnoreCase("java")){
        java++;
    }
    if (each.equalsIgnoreCase("python")){
        python++;
    }
}

        System.out.println(str);
        System.out.println("java = " + java);
        System.out.println("python = " + python);









    }
}
