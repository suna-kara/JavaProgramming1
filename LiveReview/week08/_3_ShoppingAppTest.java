package week08;

public class _3_ShoppingAppTest {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        System.out.println("-------Find the first index of 'Gloves' in items array");

        for (int i = 0; i < items.length; i++) {

            if (items[1].equalsIgnoreCase("gloves")){//items[i]: Data type (string)
                System.out.println("Gloves found at index = " + i);
              //  System.exit(0);
                break;// just to get out of loop

            }

        }

        //CTRL+ALT+L

        System.out.println("-----Set a boolean variable true if 'ipad' exists in the items------------");

        boolean ipadExists=false;
        for (String item : items){
            if (item.equalsIgnoreCase("ipad")){
                ipadExists=true;
                break;
            }
        }

        if (ipadExists)
            System.out.println("We have ipad in the list");
        else
            System.out.println("İPad NOT found");


        System.out.println("--------Look for 'Jacket' in items and if found print all the details of the item------ ");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")){
                String itemDetail=items[i]+" - $"+prices[i]+" - #"+itemIDs[i];

                System.out.println("itemDetail = " + itemDetail);
                break;
            }

        }















    }
}
