package day22_MultiDimensionalArray;

public class _3_CydeoStudent {
    public static void main(String[] args) {


        /*
        3. CydeoStudents Task:
1. given the following arrays:
 String[] batch25Group1 = {"Jilil",
"Aykhan", "Irene", "Yulia", "Muhtar"};
 String[] batch25Group2 = {"Riza",
"Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
 String[] batch25Group2 = {"Riza",
"Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
2. declare an array variable named batch25Groups with the
length of three
2.1 Assign batch25Group1,
batch25Group2, batch25Group1=3 to each indexes of the variable
batch25Groups
3. given the following arrays:
String[] batch24Group1 = {"Fuat",
"Kenann", "Aliya", "Anna", "Murodil"};
 String[] batch24Group2 = {"Layla",
"Oksana", "Tyler", "Murodil"};
 String[] batch24Group3 = {"Chris",
"Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};
        */

        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};

        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};

        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};


String[][] batch25Groups={batch25Group1,batch25Group2,batch25Group3};

        String[] batch24Group1 = {"Fuat",
                "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla",
                "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris",
                "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch24Groups = {batch24Group1,batch24Group2,batch24Group3};

        String[][][] cydeoStudent={batch25Groups,batch24Groups};

        for (String[][] eachBatch : cydeoStudent) {
            for (String[] eachGroup : eachBatch) {
                for (String eachStudent : eachGroup) {
                    System.out.print(eachStudent+"\t");
                }
                System.out.println();
            }
        }


















    }
}
