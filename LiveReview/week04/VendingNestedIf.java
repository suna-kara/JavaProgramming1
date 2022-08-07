package week04;

public class VendingNestedIf {
    public static void main(String[] args) {
         String selection = "drink";
         String drinkItem = "coffee";
         String snackItem = "chips";

         if (selection == "drink"){
             System.out.println("drink option is selected");
             if(drinkItem== "tea"){
                 System.out.println("Tea item selected");
             }else if (drinkItem == "coffee"){
                 System.out.println("coffee Item Selected");
             }
         }else if(selection == "snack"){
             System.out.println();
         }else{
             System.out.println("INVALID ENTRY");
         }

    }
}
