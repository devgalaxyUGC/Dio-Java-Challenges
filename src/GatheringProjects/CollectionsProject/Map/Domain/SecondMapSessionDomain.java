package GatheringProjects.CollectionsProject.Map.Domain;


public class SecondMapSessionDomain {
    private String BookName;
    private int bookPages;
    public SecondMapSessionDomain(String BookName, int bookPages){
        this.BookName = BookName;
        this.bookPages = bookPages;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }
}

