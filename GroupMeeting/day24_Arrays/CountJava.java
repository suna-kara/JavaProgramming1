package day24_Arrays;

public class CountJava {
    public static void main(String[] args) {
          /*
        6. Write a program that can return the number of appearances of
âjavaâ and âpythonâ anywhere in the sentence.
(similar to the task 97 in repl.it, but
this time you MUST use arrays and for each loop)
         */

        String[] sent={"Java","java","python","Python","Javaaa","Python","Java"};

int countJ=0;
int countP=0;

        for (String word : sent) {//her bir elemanı ayırıyoruz
            if (word.equalsIgnoreCase("java")) {// aynı iseler counter a ekle
                countJ++;

            }
            if (word.equalsIgnoreCase("Python")){
                countP++;
            }
        }

        System.out.println("countP = " + countP);
        System.out.println("countJ = " + countJ);

















    }
}
