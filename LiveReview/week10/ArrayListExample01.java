package week10;

import java.util.ArrayList;

public class ArrayListExample01 {

    public static void main(String[] args) {
        // to show auto-boxing
        ArrayList<Integer> arr= new ArrayList<>();

        for (int i = 0; i < 10; i++) {  // 1,2,3,4,........-----> primitives
            //How can I out primitives into ArrayList : with the help of autoboxing
            arr.add(i);
        }
    }
}
