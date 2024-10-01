import java.util.Date;

public class Book{
    private String title;
    private String author;
    private String genre;
    private int pages;
    private Date finishDate;

    public Book(String title, String author, String genre, int pages, Date finishDate){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.pages=pages;
        this.finishDate=finishDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
    public int getPages() {
        return pages;
    }

    public Date getFinishDate() {
        return finishDate;
    }
    
}