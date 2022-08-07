package Day19_LoopPractices;

public class _4_ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {//i:0,1,2,3,4

            if (i==3){
                //break; //terminates the loop

               // continue;// terminates the current iteration of the loop

                System.exit(0);// terminates the prog
            }
            System.out.println(i);
        }
        System.out.println("Wooden Spoon");
    }
}
