package week5;

public class WebTestExample {
    public static void main(String[] args) {
        WebDriver driver=new WebDriver("Opera");
        // re-usability, and benefit of Method Overloading
       // driver.findElement(new ID("ID_locator_provided"));
        driver.findElement(new Name("Nmae_locator_prvided"));
        driver.findElement(new TagName("TagName_locator_provided"));


   Locators objects=driver.navigateTo("www.google.com");  // using parent class overridden method

   Chrome chromeDriver=new Chrome("Chrome");

   ID ID_object=chromeDriver.navigateTo("www.tesla.com");   // using the child class overriding method














    }
}
