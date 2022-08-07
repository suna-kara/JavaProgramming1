package week18.poly_demo2;

public class WebElementUtility {

    // we will have a method with polymorfic parameter
    // an object reference of Webelement Interface

    public static void clickElement(WebElement element){
        System.out.println("Clicking on the element");
        element.click();  // our element object is a polymorfic object and can reach either
        // InputField or Links class click implementation
    }
    public static  WebElement getLinkWithText(String txt){
        System.out.println("Searching for a link with txt = " + txt);
         return  new Links();  // new inputField
    }
}
