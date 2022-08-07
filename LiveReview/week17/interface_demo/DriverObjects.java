package week17.interface_demo;

public class DriverObjects {
    public static void main(String[] args) {
        ChromeDriver driver1=new ChromeDriver();
        FirefoxDriver driver2=new FirefoxDriver();
        // polymprphism


        WebDriver driver3=new ChromeDriver();
        // driver3 which is a variable of

        driver1.get("www.google.com");
        driver1.findElement("//input[@name='q'");

        System.out.println("Title: "+driver1.getTitle());


        driver3.get("www.cydeo.com");

        ((ChromeDriver)driver3).someUniqMethod();
        driver3=new FirefoxDriver();
        ((FirefoxDriver)driver3).someUniqMethodForFirefox();
    }

}
