package day20_Arrays;

public class _2_reverseClasmates {
    public static void main(String[] args) {
        /*
         2. create string array, and store the names of your  class mates (10)
               reverse each students names and print them in separate lines
               ex:
               arr = {java, python, c#}
               output:
               avaJ
               nohtyp
               #c
         */


        String[] classmates = {"Mehmet", "Esra", "Sevil", "Mücahit", "Yavuz", "Davutcan", "Ayşe", "İsmail", "Dilzade", "Ömer"};

        for (int i = 0; i < classmates.length; i++) {
            for (int j = classmates[i].length() - 1; j >= 0; j--) {
                System.out.print(classmates[i].charAt(j));

            }
            System.out.println();
        }
    }
}
