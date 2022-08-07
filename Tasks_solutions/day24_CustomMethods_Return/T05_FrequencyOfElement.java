package day24_CustomMethods_Return;

public class T05_FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,2,2,3};
        int n=frequencyOfElement(arr,1);
        System.out.println(n);
    }



public static int frequencyOfElement(int[] array,int number){
    int count=0;
      for (int each : array){
          if (each== number){
              count++;
          }
      }
      return count;

    }

}
/*
5. create method that accepts one integer array and one integer number
and returns the frequency of the number
Ex:
int[] array ={1,1,1,1,1,2,2};
frequency(array, 1) ==> 5
 */