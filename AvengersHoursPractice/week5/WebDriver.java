package week5;

public class WebDriver {

    String browserType;// instance variable

    public WebDriver(String browserType){  // one parameter constructor

        this.browserType=browserType;

    }

    /*
    Method overloading examples:
    1.Happens in the same class
    2. Same name but different parameters
    3. return type does not matter same or NOT
    4. Access Modifier can be different
    5. private final methods can be overloaded
    6. static method can be overloaded
      ----- 8 different locators
     */

    public String StringfindElement(ID id){  // I want to overload with different locator objects
        return id.locator;
    }

   protected String findElement(TagName tagName){   // same name but different parameters

        return  tagName.locator;

    }


    public void findElement(Name name){
        System.out.println("Locating the webelement with name locator");
    }

    private  final  String findElement(ID id,Name name,TagName tagName){
        return  "We are using all the locators";

    }

     public  static  void clickElement(ID id){
         System.out.println("Clicking on "+id.locator);
     }

public  static  void  clickElement(Name name){
    System.out.println("Clicking on "+name.locator);
}

 public  Locators navigateTo(String link){
        Locators locators=new Locators(link);

     return new Locators(link);
 }


}
