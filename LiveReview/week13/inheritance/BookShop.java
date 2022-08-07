package week13.inheritance;

public class BookShop{
    public static void main(String[] args) {
        Book bookone=new Book();
        bookone.title="İntro to Java";
        bookone.author="Savitch";
        bookone.type="programming";
        bookone.price=85.90;

        System.out.println("bookone = " + bookone);

        AudioBook audioBook=new AudioBook("Selenium Cookbook","Automation","Unmesh",44.99,60,"Irinia");
        audioBook.listen();

        // can I call parent class method with child class object?
        audioBook.buy();
















    }






}
