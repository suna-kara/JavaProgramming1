package QuizzArrayList;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayLİst {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        Integer a = 1;
        list1.remove(a);
        System.out.println(list1);
        System.out.println("---------------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        Integer a1 = 1;
        System.out.println(list.remove(a1));

        System.out.println("---------------------------------");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5));

        list2.set(0, list2.get(4));
        list2.set(4, list2.get(0));


        System.out.println(list2);
        System.out.println("------------");
        ArrayList<Character> list3 = new ArrayList<>();

        for (char i = 'a'; i < 'z'; i++) {
            list3.add(i);

        }
        boolean result = list3.containsAll(Arrays.asList('a', 'c', 'D'));
        System.out.println(result);

        System.out.println("----------------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        for (Integer each : list4) {
            if (each % 2 != 0) {
                continue;
            }
            System.out.print(each + " ");
            break;

        }
    }
}




















