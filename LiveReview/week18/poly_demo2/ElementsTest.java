package week18.poly_demo2;

public class ElementsTest {
    public static void main(String[] args) {
Links links=new Links(); // no polymorphism
        links.click();
        links.sendKeys("EU8");
        links.getText();
        links.getLinkHref();


    WebElement loginLink=new Links(); //  There is polymorphic way
   loginLink.click(); // Dynamic poly -  Dynamic Binding
        String text= loginLink.getText();
        System.out.println("text = " + text);
        ((Links)loginLink).getLinkHref();  // Explicit-DownCAsting

        WebElement userNAme=new InputFields(); //  There is polymorphic way
        userNAme.click();
        userNAme.sendKeys("superman");

       ((InputFields)userNAme).getValue();

        System.out.println("-------Changed object of the reference Type-------");

        userNAme=new Links();  // benefit of polym

      userNAme.click();
        ((Links)userNAme).getLinkHref();

        userNAme=new InputFields();


        WebElementUtility.clickElement(loginLink);
        WebElementUtility.clickElement(userNAme);
       // WebElementUtility.clickElement("Hello");  String class is not child of WebElement

        WebElementUtility.clickElement(links);

       WebElement login =WebElementUtility.getLinkWithText("login");
       login.click();
        ((Links)login).getLinkHref();






    }
}
