package week13.inheritance;

public class EBook extends Book{
    int size;
    int pages;

    public void readBook(){
        System.out.println("Reading the book from my Tablet");
        System.out.println("title = " + title);
        System.out.println("price = " + price);
        System.out.println("author = " + author);
        System.out.println("size = " + size);
        System.out.println("type = " + type);
    }
}
