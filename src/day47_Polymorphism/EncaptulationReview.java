package day47_Polymorphism;

public class EncaptulationReview {
    private String bookTitle;
    private String publishDate;

    public void EncapsulationReview(String bookTitle, String publishDate) {
        // this.bookTitle = bookTitle;
        setBookTitle(bookTitle);
        this.publishDate = publishDate;
    }

    public EncaptulationReview(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getBookTitle() {
        if(bookTitle == null){
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if(bookTitle == null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }


}

