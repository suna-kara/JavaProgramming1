package week14.browserPagesİnheritance;

public class Browser {

    private static String browserType; // chrome,safari,edge,firefox..
    private static String operationSystem; // widows, androids,IOs..

    public Browser(String name){
        browserType=name;
    }
 static {
        operationSystem="Windows";
}
    public String getName(){return browserType;}

    public void  closeBrowser(){browserType=null;} // this method is created so we can use before setting a new one

    public void  setName(String name){  // Our setter method checks if there is already an browser type before setting a new one.
        if (browserType==null)
            this.browserType=name;

        else
            System.out.println("There is already an open browser : "+browserType);
        // Only sets a new one if there is no browser assigned




    }

    public static String getOSName(){return  operationSystem;}

  // we made read only field which is OS


}
