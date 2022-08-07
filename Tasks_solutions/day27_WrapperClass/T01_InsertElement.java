package day27_WrapperClass;

public class T01_InsertElement {

    public static void main(String[] args) {
        // parse method : converting strings to the primitives,returns primitive
        String str="123";
        int num1=Integer.parseInt(str);

        System.out.println(num1);
    }
}
/*
1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};
					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}

1.2 Create the same function for double array, char array and string array
 */