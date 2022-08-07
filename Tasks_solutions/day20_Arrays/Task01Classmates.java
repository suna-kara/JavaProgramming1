package day20_Arrays;

import java.util.Arrays;

public class Task01Classmates {
    public static void main(String[] args) {
        /*
        1. create an array named classmates, and store 10 of your classmates'
               full names
               print the initials of each classmates in separate lines
         */
        String[] classmates = {"Yasin Karadağ", "Ali Cimen", "Ekrem Mus", "Erol Aksel", "Suleyman Dagtekin",
                "Fatih Balci", "Mevlut Cetin", "Ali Turkoglu", "Metin Beyhan", "Ozkan Arikan"};
        String initials = "";

        for (int i = 0; i < classmates.length; i++) {

            System.out.print(classmates[i].charAt(0) + " " + classmates[i].charAt(classmates[i].indexOf(" ") +1) + " ");

            if (classmates[i].indexOf(" ") != classmates[i].lastIndexOf(" ")){
                System.out.print(classmates[i].charAt(classmates[i].lastIndexOf(" ") +1) + " ");
            }
            System.out.println();
        }
            }


        }
